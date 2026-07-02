package com.glasscam.app.gallery

import android.content.ContentUris
import android.content.Context
import android.net.Uri
import android.provider.MediaStore
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.glasscam.app.glass.Glass
import com.glasscam.app.glass.GlassIconButton
import com.glasscam.app.glass.liquidGlass

@Composable
fun GalleryScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    var images by remember { mutableStateOf<List<Uri>>(emptyList()) }
    LaunchedEffect(Unit) { images = queryGlassCamImages(context) }

    Box(Modifier.fillMaxSize().background(Color(0xFF0B0E14))) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier.fillMaxSize().safeDrawingPadding().padding(horizontal = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = androidx.compose.foundation.layout.PaddingValues(top = 72.dp, bottom = 24.dp),
        ) {
            items(images) { uri ->
                AsyncImage(
                    model = uri,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.aspectRatio(1f).clip(RoundedCornerShape(14.dp)),
                )
            }
        }

        if (images.isEmpty()) {
            Text(
                "Пока нет снимков",
                color = Glass.tint.copy(alpha = 0.7f),
                modifier = Modifier.align(Alignment.Center),
            )
        }

        // Top glass bar
        Row(
            Modifier.fillMaxWidth().safeDrawingPadding().padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(14.dp),
        ) {
            GlassIconButton(Icons.AutoMirrored.Rounded.ArrowBack, "Назад", onBack, size = 46.dp)
            Box(Modifier.liquidGlass(Glass.shapeCapsule).padding(horizontal = 18.dp, vertical = 10.dp)) {
                Text("Снимки", color = Glass.tint, fontWeight = FontWeight.SemiBold, fontSize = 16.sp)
            }
        }
    }
}

private fun queryGlassCamImages(context: Context): List<Uri> {
    val result = mutableListOf<Uri>()
    val collection = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
    val projection = arrayOf(MediaStore.Images.Media._ID)
    val selection = "${MediaStore.Images.Media.DISPLAY_NAME} LIKE ?"
    val args = arrayOf("GlassCam_%")
    val sort = "${MediaStore.Images.Media.DATE_ADDED} DESC"
    context.contentResolver.query(collection, projection, selection, args, sort)?.use { cursor ->
        val idCol = cursor.getColumnIndexOrThrow(MediaStore.Images.Media._ID)
        while (cursor.moveToNext()) {
            result += ContentUris.withAppendedId(collection, cursor.getLong(idCol))
        }
    }
    return result
}
