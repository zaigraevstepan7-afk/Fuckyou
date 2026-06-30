package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.Size;
import android.util.SizeF;
import android.view.KeyEvent;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class s22 {
    public static final float A;
    public static final cm B;
    public static final float C;
    public static final float D;
    public static final en1 E;
    public static final en1 F;
    public static final cm G;
    public static final g32 H;
    public static final g32 I;
    public static final cm J;
    public static final float K;
    public static final float L;
    public static final cm M;
    public static final g32 N;
    public static final en1 O;
    public static final cm P;
    public static final cm Q;
    public static final en1 R;
    public static final cm S;
    public static final cm T;
    public static final cm U;
    public static final cm V;
    public static final cm W;
    public static final cm X;
    public static final g32 Y;
    public static final float Z;
    public static final float a0;
    public static final jo b;
    public static final cm b0;
    public static final jo c;
    public static final float c0;
    public static final s30 d;
    public static final g32 d0;
    public static final s30 e;
    public static final float e0;
    public static final s30 f0;
    public static final StackTraceElement[] g0;
    public static final byte[] h0;
    public static final s30 i;
    public static final byte[] i0;
    public static final s30 j;
    public static final n81 j0;
    public static final s30 k;
    public static final s30 k0;
    public static final s30 l;
    public static final Object l0;
    public static final s30 m;
    public static final o50 m0;
    public static final en1 p;
    public static final float q;
    public static final float r;
    public static final en1 s;
    public static final cm t;
    public static final float u;
    public static final cm v;
    public static final float w;
    public static final cm x;
    public static final float y;
    public static final cm z;
    public static final jo a = new jo(-1571120048, false, new mo());
    public static final float[] f = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] g = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final m7 h = new m7(2);
    public static final a40 n = new a40(false);
    public static final a40 o = new a40(true);

    static {
        byte b2 = 0;
        b = new jo(-1455401925, false, new no(b2));
        c = new jo(1863131183, false, new pc(14, b2));
        int i2 = 1;
        d = new s30("UNDEFINED", i2);
        e = new s30("REUSABLE_CLAIMED", i2);
        i = new s30("COMPLETING_ALREADY", i2);
        j = new s30("COMPLETING_WAITING_CHILDREN", i2);
        k = new s30("COMPLETING_RETRY", i2);
        l = new s30("TOO_LATE_TO_CANCEL", i2);
        m = new s30("SEALED", i2);
        en1 en1Var = en1.h;
        p = en1Var;
        q = 12.0f;
        r = 10.0f;
        s = en1.e;
        cm cmVar = cm.i;
        t = cmVar;
        u = 0.38f;
        v = cmVar;
        w = 0.38f;
        x = cmVar;
        y = 0.38f;
        z = cmVar;
        A = 0.38f;
        B = cmVar;
        C = 0.38f;
        D = 8.0f;
        E = en1Var;
        F = en1.i;
        G = cmVar;
        H = g32.e;
        I = g32.i;
        cm cmVar2 = cm.j;
        J = cmVar2;
        K = 16.0f;
        L = 56.0f;
        M = cmVar2;
        g32 g32Var = g32.h;
        N = g32Var;
        O = en1Var;
        P = cm.p;
        Q = cm.o;
        R = en1Var;
        cm cmVar3 = cm.h;
        S = cmVar3;
        T = cmVar3;
        U = cmVar3;
        V = cmVar3;
        W = cmVar3;
        X = cmVar2;
        Y = g32.f;
        Z = 88.0f;
        a0 = 10.0f;
        b0 = cmVar2;
        c0 = 16.0f;
        d0 = g32Var;
        e0 = 72.0f;
        f0 = new s30("NO_OWNER", i2);
        g0 = new StackTraceElement[0];
        h0 = new byte[]{112, 114, 111, 0};
        i0 = new byte[]{112, 114, 109, 0};
        j0 = new n81(4, new pc(26, b2), new mt(27));
        k0 = new s30("NO_VALUE", i2);
        l0 = new Object();
        m0 = new o50(0, 0);
    }

    public static int[] A(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iL = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iL += (int) xk.L(byteArrayInputStream, 2);
            iArr[i3] = iL;
        }
        return iArr;
    }

    public static xx[] B(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, xx[] xxVarArr) throws IOException {
        byte[] bArr3 = c2.A;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, c2.B)) {
                yc.l("Unsupported meta version");
                return null;
            }
            int iL = (int) xk.L(fileInputStream, 2);
            byte[] bArrK = xk.K(fileInputStream, (int) xk.L(fileInputStream, 4), (int) xk.L(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                yc.l("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrK);
            try {
                xx[] xxVarArrD = D(byteArrayInputStream, bArr2, iL, xxVarArr);
                byteArrayInputStream.close();
                return xxVarArrD;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(c2.v, bArr2)) {
            yc.l("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            yc.l("Unsupported meta version");
            return null;
        }
        int iL2 = (int) xk.L(fileInputStream, 1);
        byte[] bArrK2 = xk.K(fileInputStream, (int) xk.L(fileInputStream, 4), (int) xk.L(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            yc.l("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrK2);
        try {
            xx[] xxVarArrC = C(byteArrayInputStream2, iL2, xxVarArr);
            byteArrayInputStream2.close();
            return xxVarArrC;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static xx[] C(ByteArrayInputStream byteArrayInputStream, int i2, xx[] xxVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new xx[0];
        }
        if (i2 != xxVarArr.length) {
            yc.l("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iL = (int) xk.L(byteArrayInputStream, 2);
            iArr[i3] = (int) xk.L(byteArrayInputStream, 2);
            strArr[i3] = new String(xk.J(byteArrayInputStream, iL), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            xx xxVar = xxVarArr[i4];
            if (!xxVar.b.equals(strArr[i4])) {
                yc.l("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            xxVar.e = i5;
            xxVar.h = A(byteArrayInputStream, i5);
        }
        return xxVarArr;
    }

    public static xx[] D(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, xx[] xxVarArr) {
        xx xxVar;
        if (byteArrayInputStream.available() == 0) {
            return new xx[0];
        }
        if (i2 != xxVarArr.length) {
            yc.l("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            xk.L(byteArrayInputStream, 2);
            String str = new String(xk.J(byteArrayInputStream, (int) xk.L(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jL = xk.L(byteArrayInputStream, 4);
            int iL = (int) xk.L(byteArrayInputStream, 2);
            if (xxVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i4 = 0; i4 < xxVarArr.length; i4++) {
                    if (xxVarArr[i4].b.equals(strSubstring)) {
                        xxVar = xxVarArr[i4];
                        break;
                    }
                }
                xxVar = null;
            } else {
                xxVar = null;
            }
            if (xxVar == null) {
                yc.l("Missing profile key: ".concat(str));
                return null;
            }
            xxVar.d = jL;
            int[] iArrA = A(byteArrayInputStream, iL);
            if (Arrays.equals(bArr, c2.z)) {
                xxVar.e = iL;
                xxVar.h = iArrA;
            }
        }
        return xxVarArr;
    }

    public static xx[] E(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, c2.w)) {
            yc.l("Unsupported version");
            return null;
        }
        int iL = (int) xk.L(fileInputStream, 1);
        byte[] bArrK = xk.K(fileInputStream, (int) xk.L(fileInputStream, 4), (int) xk.L(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            yc.l("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrK);
        try {
            xx[] xxVarArrF = F(byteArrayInputStream, str, iL);
            byteArrayInputStream.close();
            return xxVarArrF;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static xx[] F(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new xx[0];
        }
        xx[] xxVarArr = new xx[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iL = (int) xk.L(byteArrayInputStream, 2);
            int iL2 = (int) xk.L(byteArrayInputStream, 2);
            xxVarArr[i4] = new xx(str, new String(xk.J(byteArrayInputStream, iL), StandardCharsets.UTF_8), xk.L(byteArrayInputStream, 4), iL2, (int) xk.L(byteArrayInputStream, 4), (int) xk.L(byteArrayInputStream, 4), new int[iL2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            xx xxVar = xxVarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = xxVar.f;
            int i7 = xxVar.g;
            TreeMap treeMap = xxVar.i;
            int i8 = iAvailable - i6;
            int iL3 = i3;
            while (byteArrayInputStream.available() > i8) {
                iL3 += (int) xk.L(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iL3), 1);
                int iL4 = (int) xk.L(byteArrayInputStream, 2);
                while (iL4 > 0) {
                    xk.L(byteArrayInputStream, 2);
                    int iL5 = (int) xk.L(byteArrayInputStream, 1);
                    if (iL5 != 6 && iL5 != 7) {
                        while (iL5 > 0) {
                            xk.L(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iL6 = (int) xk.L(byteArrayInputStream, 1); iL6 > 0; iL6--) {
                                xk.L(byteArrayInputStream, 2);
                            }
                            iL5--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iL4--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                yc.l("Read too much data during profile line parse");
                return null;
            }
            xxVar.h = A(byteArrayInputStream, xxVar.e);
            BitSet bitSetValueOf = BitSet.valueOf(xk.J(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | numValueOf.intValue()));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return xxVarArr;
    }

    public static final void G(mp1 mp1Var, int i2, Object obj) {
        int iH = mp1Var.h(i2);
        Object[] objArr = mp1Var.c;
        Object obj2 = objArr[iH];
        objArr[iH] = kp.a;
        if (obj == obj2) {
            return;
        }
        mp.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void H(ks ksVar, Object obj) throws ly {
        oj0 oj0Var;
        if (!(ksVar instanceof my)) {
            ksVar.g(obj);
            return;
        }
        my myVar = (my) ksVar;
        ot otVar = myVar.h;
        ls lsVar = myVar.i;
        Throwable thA = pe1.a(obj);
        Object onVar = thA == null ? obj : new on(thA, false);
        if (J(otVar, lsVar.e())) {
            myVar.j = onVar;
            myVar.g = 1;
            I(otVar, lsVar.e(), myVar);
            return;
        }
        b50 b50VarA = l02.a();
        if (b50VarA.g >= 4294967296L) {
            myVar.j = onVar;
            myVar.g = 1;
            b50VarA.m(myVar);
            return;
        }
        b50VarA.n(true);
        try {
            oj0Var = (oj0) lsVar.e().l(v20.O);
        } finally {
            try {
            } finally {
            }
        }
        if (oj0Var == null || oj0Var.b()) {
            Object obj2 = myVar.k;
            lt ltVarE = lsVar.e();
            Object objM = xi0.M(ltVarE, obj2);
            p32 p32VarP0 = objM != xi0.b0 ? lk.p0(lsVar, ltVarE, objM) : null;
            try {
                lsVar.g(obj);
            } finally {
                if (p32VarP0 == null || p32VarP0.q0()) {
                    xi0.G(ltVarE, objM);
                }
            }
        }
        myVar.g(xc.p(oj0Var.p()));
        while (b50VarA.t()) {
        }
    }

    public static final void I(ot otVar, lt ltVar, Runnable runnable) throws ly {
        try {
            otVar.e(ltVar, runnable);
        } catch (Throwable th) {
            throw new ly(th, otVar, ltVar);
        }
    }

    public static final boolean J(ot otVar, lt ltVar) throws ly {
        try {
            return otVar.f(ltVar);
        } catch (Throwable th) {
            throw new ly(th, otVar, ltVar);
        }
    }

    public static final void K(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static final tv0 L(ly1 ly1Var) {
        return new nw1(ly1Var);
    }

    public static final k40 M(d22 d22Var, sa0 sa0Var, Object obj, ob0 ob0Var) {
        ob0Var.U(-422486690, d22Var);
        boolean zG = d22Var.g();
        k40 k40Var = k40.g;
        k40 k40Var2 = k40.f;
        k40 k40Var3 = k40.e;
        if (zG) {
            ob0Var.W(-212166497);
            ob0Var.p(false);
            if (((Boolean) sa0Var.i(obj)).booleanValue()) {
                k40Var = k40Var2;
            } else if (!((Boolean) sa0Var.i(d22Var.c())).booleanValue()) {
                k40Var = k40Var3;
            }
        } else {
            ob0Var.W(-211890659);
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = xc.B(Boolean.FALSE);
                ob0Var.f0(objK);
            }
            fy0 fy0Var = (fy0) objK;
            if (((Boolean) sa0Var.i(d22Var.c())).booleanValue()) {
                fy0Var.setValue(Boolean.TRUE);
            }
            Object value = d22Var.e.getValue();
            if (((Boolean) sa0Var.i(obj)).booleanValue()) {
                k40Var = k40Var2;
            } else if ((value != null && ((Boolean) sa0Var.i(value)).booleanValue()) || !((Boolean) fy0Var.getValue()).booleanValue()) {
                k40Var = k40Var3;
            }
            ob0Var.p(false);
        }
        ob0Var.p(false);
        return k40Var;
    }

    public static void N(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        xi0.H(classCastException, s22.class.getName());
        throw classCastException;
    }

    public static final long O(long j2) {
        long j3 = 63 & j2;
        int i2 = (int) j3;
        return i2 <= 15 ? j2 : i2 == gm.u.c ? lk.l0(j2) : ((i2 == gm.v.c || i2 == gm.w.c) && Build.VERSION.SDK_INT < 34) ? lk.l0(j2) : (i2 != gm.x.c || Build.VERSION.SDK_INT >= 36) ? (j2 & (-64)) | (j3 - 1) : lk.l0(j2);
    }

    public static final long P(long j2) {
        int i2 = (int) (63 & j2);
        return (i2 == gm.x.c || i2 == gm.s.c || i2 == gm.t.c) ? O(vl.a(j2, gm.e)) : O(j2);
    }

    /* JADX WARN: Finally extract failed */
    public static boolean Q(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, xx[] xxVarArr) throws IOException {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = c2.z;
        byte[] bArr3 = c2.y;
        byte[] bArr4 = c2.v;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = c2.w;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrO = o(xxVarArr, bArr5);
                xk.R(byteArrayOutputStream, xxVarArr.length, 1);
                xk.R(byteArrayOutputStream, bArrO.length, 4);
                byte[] bArrJ = xk.j(bArrO);
                xk.R(byteArrayOutputStream, bArrJ.length, 4);
                byteArrayOutputStream.write(bArrJ);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                xk.R(byteArrayOutputStream, xxVarArr.length, 1);
                for (xx xxVar : xxVarArr) {
                    int size = xxVar.i.size() * 4;
                    String strS = s(xxVar.a, xxVar.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    xk.S(byteArrayOutputStream, strS.getBytes(charset).length);
                    xk.S(byteArrayOutputStream, xxVar.h.length);
                    xk.R(byteArrayOutputStream, size, 4);
                    xk.R(byteArrayOutputStream, xxVar.c, 4);
                    byteArrayOutputStream.write(strS.getBytes(charset));
                    Iterator it = xxVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        xk.S(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        xk.S(byteArrayOutputStream, 0);
                    }
                    for (int i4 : xxVar.h) {
                        xk.S(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = c2.x;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrO2 = o(xxVarArr, bArr6);
                xk.R(byteArrayOutputStream, xxVarArr.length, 1);
                xk.R(byteArrayOutputStream, bArrO2.length, 4);
                byte[] bArrJ2 = xk.j(bArrO2);
                xk.R(byteArrayOutputStream, bArrJ2.length, 4);
                byteArrayOutputStream.write(bArrJ2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            xk.S(byteArrayOutputStream, xxVarArr.length);
            for (xx xxVar2 : xxVarArr) {
                String str = xxVar2.a;
                TreeMap treeMap = xxVar2.i;
                String strS2 = s(str, xxVar2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                xk.S(byteArrayOutputStream, strS2.getBytes(charset2).length);
                xk.S(byteArrayOutputStream, treeMap.size());
                xk.S(byteArrayOutputStream, xxVar2.h.length);
                xk.R(byteArrayOutputStream, xxVar2.c, 4);
                byteArrayOutputStream.write(strS2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    xk.S(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : xxVar2.h) {
                    xk.S(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            xk.S(byteArrayOutputStream2, xxVarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (xx xxVar3 : xxVarArr) {
                xk.R(byteArrayOutputStream2, xxVar3.c, 4);
                xk.R(byteArrayOutputStream2, xxVar3.d, 4);
                xk.R(byteArrayOutputStream2, xxVar3.g, 4);
                String strS3 = s(xxVar3.a, xxVar3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strS3.getBytes(charset3).length;
                xk.S(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(strS3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            z92 z92Var = new z92(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(z92Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < xxVarArr.length) {
                try {
                    xx xxVar4 = xxVarArr[i8];
                    xk.S(byteArrayOutputStream3, i8);
                    xk.S(byteArrayOutputStream3, xxVar4.e);
                    i9 = i9 + 4 + (xxVar4.e * i6);
                    int[] iArr = xxVar4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        xk.S(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            z92 z92Var2 = new z92(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(z92Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < xxVarArr.length; i14++) {
                try {
                    xx xxVar5 = xxVarArr[i14];
                    Iterator it3 = xxVar5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        X(byteArrayOutputStream4, iIntValue, xxVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            Y(byteArrayOutputStream4, xxVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            xk.S(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i13 + 6;
                            xk.R(byteArrayOutputStream3, length4, 4);
                            xk.S(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i15 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            z92 z92Var3 = new z92(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(z92Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            xk.R(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                z92 z92Var4 = (z92) arrayList.get(i16);
                int i17 = z92Var4.a;
                byte[] bArr7 = z92Var4.b;
                if (i17 != 1) {
                    i2 = i12;
                    if (i17 == i2) {
                        j2 = 1;
                    } else if (i17 == 3) {
                        j2 = 2;
                    } else if (i17 == 4) {
                        j2 = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                xk.R(byteArrayOutputStream, j2, 4);
                xk.R(byteArrayOutputStream, size2, 4);
                if (z92Var4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrJ3 = xk.j(bArr7);
                    arrayList2.add(bArrJ3);
                    xk.R(byteArrayOutputStream, bArrJ3.length, 4);
                    xk.R(byteArrayOutputStream, length5, 4);
                    length = bArrJ3.length;
                } else {
                    arrayList2.add(bArr7);
                    xk.R(byteArrayOutputStream, bArr7.length, 4);
                    xk.R(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i16++;
                i12 = i2;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static final CharSequence R(CharSequence charSequence) {
        return charSequence.length() <= 5000 ? charSequence : (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? ct1.W(charSequence, 4999) : ct1.W(charSequence, 5000);
    }

    public static final Object S(Object obj) {
        if0 if0Var;
        jf0 jf0Var = obj instanceof jf0 ? (jf0) obj : null;
        return (jf0Var == null || (if0Var = jf0Var.a) == null) ? obj : if0Var;
    }

    public static final void T(int i2, int i3, int i4) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= i3) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        StringBuilder sbN = s91.n("OffsetMapping.originalToTransformed returned invalid mapping: ", i4, " -> ", i2, " is not in range of transformed text [0, ");
        sbN.append(i3);
        sbN.append("]");
        qg0.c(sbN.toString());
    }

    public static final void U(int i2, int i3, int i4) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= i3) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        StringBuilder sbN = s91.n("OffsetMapping.transformedToOriginal returned invalid mapping: ", i4, " -> ", i2, " is not in range of original text [0, ");
        sbN.append(i3);
        sbN.append("]");
        qg0.c(sbN.toString());
    }

    public static void V(ByteArrayOutputStream byteArrayOutputStream, xx xxVar) throws IOException {
        Y(byteArrayOutputStream, xxVar);
        int i2 = xxVar.g;
        int[] iArr = xxVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            xk.S(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : xxVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void W(ByteArrayOutputStream byteArrayOutputStream, xx xxVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        xk.S(byteArrayOutputStream, str.getBytes(charset).length);
        xk.S(byteArrayOutputStream, xxVar.e);
        xk.R(byteArrayOutputStream, xxVar.f, 4);
        xk.R(byteArrayOutputStream, xxVar.c, 4);
        xk.R(byteArrayOutputStream, xxVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, int i2, xx xxVar) throws IOException {
        int i3 = xxVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : xxVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void Y(ByteArrayOutputStream byteArrayOutputStream, xx xxVar) {
        int i2 = 0;
        for (Map.Entry entry : xxVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                xk.S(byteArrayOutputStream, iIntValue - i2);
                xk.S(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    public static final int Z(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x067c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(d22 d22Var, sa0 sa0Var, tv0 tv0Var, w40 w40Var, j50 j50Var, wa0 wa0Var, jo joVar, ob0 ob0Var, int i2) {
        int i3;
        ob0 ob0Var2;
        jo joVar2;
        v41 v41Var;
        boolean z2;
        Object objK;
        int i4;
        d22 d22Var2;
        boolean zF;
        Object objK2;
        boolean zF2;
        Object objK3;
        Object objC;
        v41 v41Var2;
        Object value;
        k40 k40Var;
        k40 k40Var2;
        w40 w40Var2;
        boolean zF3;
        Object objK4;
        j50 j50Var2;
        fy0 fy0VarD;
        boolean zF4;
        Object objK5;
        wa0 wa0Var2;
        Object objK6;
        fy0 fy0Var;
        boolean zH;
        Object objK7;
        boolean z3;
        Object objK8;
        vn1 vn1Var;
        Object objK9;
        ha0 ha0Var;
        boolean z4;
        boolean zH2;
        Object objK10;
        boolean zC;
        e22 e22Var;
        boolean z5;
        z12 z12Var;
        ob0 ob0Var3;
        boolean z6;
        tv0 tv0Var2;
        vn1 vn1Var2;
        boolean z7;
        boolean z8;
        ra raVar;
        vn1 vn1Var3;
        r22 r22Var;
        tv0 tv0Var3;
        j50 j50Var3;
        z12 z12Var2;
        z12 z12Var3;
        z12 z12Var4;
        tv0 tv0Var4;
        z12 z12Var5;
        z12 z12VarG;
        boolean zH3;
        Object objK11;
        j50 j50Var4;
        vn1 vn1Var4;
        boolean zG;
        Object objK12;
        Object objK13;
        ra raVar2;
        ob0 ob0Var4;
        jo joVar3;
        boolean z9;
        k40 k40VarM;
        tv0 tv0Var5 = tv0Var;
        jo joVar4 = joVar;
        ob0 ob0Var5 = ob0Var;
        v41 v41Var3 = d22Var.e;
        ob0Var5.X(-1310802509);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var5.f(d22Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var5.h(sa0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var5.f(tv0Var5) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ob0Var5.f(w40Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ob0Var5.f(j50Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ob0Var5.h(wa0Var) ? 131072 : 65536;
        }
        int i5 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            i5 |= ob0Var5.h(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= ob0Var5.h(joVar4) ? 67108864 : 33554432;
        }
        int i6 = i5;
        if (ob0Var5.N(i6 & 1, (i6 & 38347923) != 38347922)) {
            v41 v41Var4 = d22Var.d;
            Object value2 = v41Var3.getValue();
            if (((Boolean) sa0Var.i(v41Var4.getValue())).booleanValue() || ((Boolean) sa0Var.i(d22Var.c())).booleanValue() || ((value2 != null && ((Boolean) sa0Var.i(value2)).booleanValue()) || d22Var.g() || d22Var.d())) {
                ob0Var5.W(-274042349);
                int i7 = i6 & 14;
                int i8 = i7 | 48;
                int i9 = i8 & 14;
                int i10 = 6;
                boolean z10 = ((i9 ^ 6) > 4 && ob0Var5.f(d22Var)) || (i8 & 6) == 4;
                Object objK14 = ob0Var5.K();
                l91 l91Var = kp.a;
                if (z10 || objK14 == l91Var) {
                    objK14 = d22Var.c();
                    ob0Var5.f0(objK14);
                }
                if (d22Var.g()) {
                    objK14 = d22Var.c();
                }
                ob0Var5.W(-1270450094);
                k40 k40VarM2 = M(d22Var, sa0Var, objK14, ob0Var5);
                ob0Var5.p(false);
                Object value3 = v41Var4.getValue();
                ob0Var5.W(-1270450094);
                k40 k40VarM3 = M(d22Var, sa0Var, value3, ob0Var5);
                ob0Var5.p(false);
                int i11 = i9 | 3072;
                int i12 = (i11 & 14) ^ 6;
                if (i12 <= 4 || !ob0Var5.f(d22Var)) {
                    v41Var = v41Var3;
                    if ((i11 & 6) != 4) {
                        z2 = false;
                    }
                    objK = ob0Var5.K();
                    if (!z2 || objK == l91Var) {
                        i4 = i11;
                        objK = new d22(new xg0(k40VarM2), d22Var, d22Var.c.concat(" > EnterExitTransition"));
                        ob0Var5.f0(objK);
                    } else {
                        i4 = i11;
                    }
                    d22Var2 = (d22) objK;
                    zF = ((i12 <= 4 && ob0Var5.f(d22Var)) || (i4 & 6) == 4) | ob0Var5.f(d22Var2);
                    objK2 = ob0Var5.K();
                    if (zF || objK2 == l91Var) {
                        objK2 = new d(25, d22Var, d22Var2);
                        ob0Var5.f0(objK2);
                    }
                    wi0.c(d22Var2, (sa0) objK2, ob0Var5);
                    if (d22Var.g()) {
                        d22Var2.k(k40VarM3);
                        d22Var2.l.setValue(Boolean.FALSE);
                    } else {
                        d22Var2.j(k40VarM2, k40VarM3);
                    }
                    if (d22Var.g()) {
                        ob0Var5.W(782386797);
                        Object value4 = v41Var.getValue();
                        if (value4 == null) {
                            ob0Var5.W(782437481);
                            z9 = false;
                            ob0Var5.p(false);
                            k40VarM = null;
                        } else {
                            z9 = false;
                            ob0Var5.W(782437482);
                            ob0Var5.W(-1270450094);
                            k40VarM = M(d22Var, sa0Var, value4, ob0Var5);
                            ob0Var5.p(false);
                            ob0Var5.p(false);
                        }
                        d22Var2.e.setValue(k40VarM);
                        ob0Var5.p(z9);
                    } else {
                        ob0Var5.W(782538635);
                        ob0Var5.p(false);
                    }
                    r22 r22Var2 = r40.a;
                    zF2 = ob0Var5.f(d22Var2);
                    objK3 = ob0Var5.K();
                    if (!zF2 || objK3 == l91Var) {
                        objK3 = xc.B(w40Var);
                        ob0Var5.f0(objK3);
                    }
                    fy0 fy0Var2 = (fy0) objK3;
                    objC = d22Var2.c();
                    v41Var2 = d22Var2.d;
                    value = v41Var2.getValue();
                    k40Var = k40.g;
                    k40Var2 = k40.f;
                    if (objC == value || d22Var2.c() != k40Var2) {
                        if (v41Var2.getValue() != k40Var) {
                            fy0Var2.setValue(((w40) fy0Var2.getValue()).a(w40Var));
                        }
                    } else if (d22Var2.g()) {
                        fy0Var2.setValue(w40Var);
                    } else {
                        fy0Var2.setValue(w40.b);
                    }
                    w40Var2 = (w40) fy0Var2.getValue();
                    zF3 = ob0Var5.f(d22Var2);
                    objK4 = ob0Var5.K();
                    if (!zF3 || objK4 == l91Var) {
                        objK4 = xc.B(j50Var);
                        ob0Var5.f0(objK4);
                    }
                    fy0 fy0Var3 = (fy0) objK4;
                    if (d22Var2.c() == v41Var2.getValue() || d22Var2.c() != k40Var2) {
                        if (v41Var2.getValue() != k40Var2) {
                            e22 e22Var2 = ((j50) fy0Var3.getValue()).a;
                            e22 e22Var3 = j50Var.a;
                            p50 p50Var = e22Var3.a;
                            if (p50Var == null) {
                                p50Var = e22Var2.a;
                            }
                            p50 p50Var2 = p50Var;
                            mi1 mi1Var = e22Var3.b;
                            if (mi1Var == null) {
                                mi1Var = e22Var2.b;
                            }
                            mi1 mi1Var2 = mi1Var;
                            boolean z11 = e22Var3.c || e22Var2.c;
                            Map map = e22Var2.d;
                            Map map2 = e22Var3.d;
                            map.getClass();
                            map2.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                            linkedHashMap.putAll(map2);
                            fy0Var3.setValue(new j50(new e22(p50Var2, (wi0) null, mi1Var2, z11, linkedHashMap)));
                        }
                    } else if (d22Var2.g()) {
                        fy0Var3.setValue(j50Var);
                    } else {
                        fy0Var3.setValue(j50.b);
                    }
                    j50Var2 = (j50) fy0Var3.getValue();
                    fy0VarD = xc.D(wa0Var, ob0Var5);
                    Object objH = wa0Var.h(d22Var2.c(), v41Var2.getValue());
                    zF4 = ob0Var5.f(d22Var2) | ob0Var5.f(fy0VarD);
                    objK5 = ob0Var5.K();
                    if (!zF4 || objK5 == l91Var) {
                        objK5 = new g(d22Var2, fy0VarD, (ks) null, 1);
                        ob0Var5.f0(objK5);
                    }
                    wa0Var2 = (wa0) objK5;
                    objK6 = ob0Var5.K();
                    if (objK6 == l91Var) {
                        objK6 = xc.B(objH);
                        ob0Var5.f0(objK6);
                    }
                    fy0Var = (fy0) objK6;
                    zH = ob0Var5.h(wa0Var2);
                    objK7 = ob0Var5.K();
                    if (!zH || objK7 == l91Var) {
                        objK7 = new jq1(wa0Var2, fy0Var, null, 0);
                        ob0Var5.f0(objK7);
                    }
                    wi0.i((wa0) objK7, ob0Var5, t32.a);
                    if (d22Var2.c() != k40Var && v41Var2.getValue() == k40Var && ((Boolean) fy0Var.getValue()).booleanValue()) {
                        ob0Var5.W(-270853937);
                        ob0Var5.p(false);
                        joVar3 = joVar;
                        z5 = false;
                        ob0Var4 = ob0Var5;
                    } else {
                        ob0Var5.W(-272355980);
                        z3 = i7 != 4;
                        objK8 = ob0Var5.K();
                        if (!z3 || objK8 == l91Var) {
                            objK8 = new ra();
                            ob0Var5.f0(objK8);
                        }
                        ra raVar3 = (ra) objK8;
                        raVar3.b.getClass();
                        vn1Var = raVar3.b;
                        r22 r22Var3 = c2.V;
                        objK9 = ob0Var5.K();
                        if (objK9 == l91Var) {
                            objK9 = zp.m;
                            ob0Var5.f0(objK9);
                        }
                        ha0Var = (ha0) objK9;
                        ob0Var5.W(-1491182875);
                        ob0Var5.p(false);
                        ob0Var5.W(-1491180092);
                        ob0Var5.p(false);
                        if (vn1Var != null) {
                            ob0Var5.W(-968938819);
                            boolean zF5 = ob0Var5.f(d22Var2);
                            Object objK15 = ob0Var5.K();
                            if (zF5 || objK15 == l91Var) {
                                objK15 = new vn1();
                                ob0Var5.f0(objK15);
                            }
                            vn1Var = (vn1) objK15;
                            z4 = false;
                        } else {
                            z4 = false;
                            ob0Var5.W(-31257052);
                        }
                        ob0Var5.p(z4);
                        vn1Var.c(d22Var2.e.getValue() == null);
                        zH2 = ob0Var5.h(vn1Var);
                        objK10 = ob0Var5.K();
                        if (!zH2 || objK10 == l91Var) {
                            objK10 = new a7(4, vn1Var);
                            ob0Var5.f0(objK10);
                        }
                        r40.a(d22Var2, (ha0) objK10, ob0Var5, 0);
                        e22 e22Var4 = w40Var2.a;
                        e22 e22Var5 = j50Var2.a;
                        zC = vl.c(vn1Var.e, vl.f);
                        vn1 vn1Var5 = vn1Var;
                        if (oh0.a(vn1Var.i, 0L)) {
                            ob0 ob0Var6 = ob0Var;
                            ob0Var6.W(1018653691);
                            Object objK16 = ob0Var6.K();
                            if (objK16 == l91Var) {
                                objK16 = "Built-in slide";
                                ob0Var6.f0("Built-in slide");
                            }
                            String str = (String) objK16;
                            e22Var = e22Var5;
                            z5 = false;
                            z12 z12VarG2 = kd1.g(d22Var2, r22Var3, str, ob0Var6, 384, 0);
                            ob0Var6.p(false);
                            z12Var = z12VarG2;
                            ob0Var3 = ob0Var6;
                        } else {
                            ob0 ob0Var7 = ob0Var;
                            e22Var = e22Var5;
                            z5 = false;
                            ob0Var7.W(1018759494);
                            ob0Var7.p(false);
                            z12Var = null;
                            ob0Var3 = ob0Var7;
                        }
                        ob0Var3.W(1018962109);
                        ob0Var3.p(z5);
                        ob0Var3.W(1019206141);
                        ob0Var3.p(z5);
                        boolean z12 = !false;
                        cf1 cf1Var = gm.e;
                        tv0 tv0Var6 = qv0.a;
                        if (zC) {
                            ob0Var3.W(1019733235);
                            z6 = z12;
                            r22 r22Var4 = new r22(a4.t, new g3(i10, cf1Var));
                            Object objK17 = ob0Var3.K();
                            if (objK17 == l91Var) {
                                objK17 = "Built-in veil";
                                ob0Var3.f0("Built-in veil");
                            }
                            String str2 = (String) objK17;
                            tv0Var2 = tv0Var6;
                            l52 l52Var = new l52(d22Var2, kd1.g(d22Var2, r22Var4, str2, ob0Var3, 384, 0), w40Var2, j50Var2, vn1Var5);
                            vn1Var2 = vn1Var5;
                            ob0Var3.p(z5);
                            tv0Var6 = l52Var;
                        } else {
                            z6 = z12;
                            tv0Var2 = tv0Var6;
                            vn1Var2 = vn1Var5;
                            ob0Var3.W(1020031362);
                            ob0Var3.p(z5);
                        }
                        r22 r22Var5 = c2.P;
                        z7 = (e22Var4.a != null && e22Var.a == null && vn1Var2.f == 1.0f) ? z5 : true;
                        boolean z13 = (e22Var4.b != null && e22Var.b == null && vn1Var2.g == 1.0f) ? z5 : true;
                        if (z7) {
                            z8 = z13;
                            raVar = raVar3;
                            vn1Var3 = vn1Var2;
                            r22Var = r22Var5;
                            tv0Var3 = tv0Var6;
                            j50Var3 = j50Var2;
                            ob0Var3.W(-1511696126);
                            ob0Var3.p(z5);
                            z12Var2 = null;
                        } else {
                            ob0Var3.W(-1511865571);
                            Object objK18 = ob0Var3.K();
                            if (objK18 == l91Var) {
                                objK18 = "Built-in alpha";
                                ob0Var3.f0("Built-in alpha");
                            }
                            vn1 vn1Var6 = vn1Var2;
                            r22Var = r22Var5;
                            z8 = z13;
                            raVar = raVar3;
                            tv0Var3 = tv0Var6;
                            j50Var3 = j50Var2;
                            vn1Var3 = vn1Var6;
                            z12 z12VarG3 = kd1.g(d22Var2, r22Var, (String) objK18, ob0Var3, 384, 0);
                            ob0Var3.p(z5);
                            z12Var2 = z12VarG3;
                        }
                        if (z8) {
                            z12Var3 = z12Var2;
                            ob0Var3.W(-1511459038);
                            ob0Var3.p(z5);
                            z12Var4 = null;
                        } else {
                            ob0Var3.W(-1511628483);
                            Object objK19 = ob0Var3.K();
                            if (objK19 == l91Var) {
                                objK19 = "Built-in scale";
                                ob0Var3.f0("Built-in scale");
                            }
                            z12Var3 = z12Var2;
                            z12 z12VarG4 = kd1.g(d22Var2, r22Var, (String) objK19, ob0Var3, 384, 0);
                            ob0Var3.p(z5);
                            z12Var4 = z12VarG4;
                        }
                        if (z8) {
                            tv0Var4 = tv0Var3;
                            z12Var5 = z12Var4;
                            ob0Var3.W(-1511209054);
                            ob0Var3.p(z5);
                            z12VarG = null;
                        } else {
                            ob0Var3.W(-1511381382);
                            tv0Var4 = tv0Var3;
                            z12Var5 = z12Var4;
                            z12VarG = kd1.g(d22Var2, r40.a, "TransformOriginInterruptionHandling", ob0Var3, 384, 0);
                            ob0Var3.p(z5);
                        }
                        zH3 = ob0Var3.h(z12Var3) | ob0Var3.f(w40Var2) | ob0Var3.f(j50Var3) | ob0Var3.h(vn1Var3) | ob0Var3.h(z12Var5) | ob0Var3.f(d22Var2) | ob0Var3.h(z12VarG);
                        objK11 = ob0Var3.K();
                        if (!zH3 || objK11 == l91Var) {
                            vn1 vn1Var7 = vn1Var3;
                            j50 j50Var5 = j50Var3;
                            objK11 = new m40(z12Var3, vn1Var7, z12Var5, d22Var2, w40Var2, j50Var5, z12VarG);
                            j50Var4 = j50Var5;
                            vn1Var4 = vn1Var7;
                            ob0Var3.f0(objK11);
                        } else {
                            vn1Var4 = vn1Var3;
                            j50Var4 = j50Var3;
                        }
                        m40 m40Var = (m40) objK11;
                        zG = ob0Var3.g(z6) | ob0Var3.f(ha0Var);
                        objK12 = ob0Var3.K();
                        if (!zG || objK12 == l91Var) {
                            objK12 = new q40(z6, ha0Var);
                            ob0Var3.f0(objK12);
                        }
                        tv0 tv0VarC = c2.m(tv0Var2, (sa0) objK12).c(new l40(d22Var2, null, null, z12Var, w40Var2, j50Var4, vn1Var4, ha0Var, m40Var)).c(tv0Var4);
                        ob0Var3.W(-1255668613);
                        ob0Var3.p(z5);
                        tv0Var5 = tv0Var;
                        tv0 tv0VarC2 = tv0Var5.c(tv0VarC.c(tv0Var2));
                        objK13 = ob0Var3.K();
                        if (objK13 != l91Var) {
                            raVar2 = raVar;
                            objK13 = new fa(raVar2);
                            ob0Var3.f0(objK13);
                        } else {
                            raVar2 = raVar;
                        }
                        fa faVar = (fa) objK13;
                        int iHashCode = Long.hashCode(ob0Var3.T);
                        b61 b61VarL = ob0Var3.l();
                        tv0 tv0VarP = bk.P(ob0Var3, tv0VarC2);
                        ep.c.getClass();
                        zp zpVar = dp.b;
                        ob0Var3.Z();
                        if (ob0Var3.S) {
                            ob0Var3.i0();
                        } else {
                            ob0Var3.k(zpVar);
                        }
                        xc.E(dp.f, ob0Var3, faVar);
                        xc.E(dp.e, ob0Var3, b61VarL);
                        xc.z(ob0Var3, Integer.valueOf(iHashCode), dp.g);
                        xc.C(ob0Var3, dp.h);
                        xc.E(dp.d, ob0Var3, tv0VarP);
                        jo joVar5 = joVar;
                        joVar5.f(raVar2, ob0Var3, Integer.valueOf((i6 >> 21) & 112));
                        ob0Var3.p(true);
                        ob0Var3.p(z5);
                        joVar3 = joVar5;
                        ob0Var4 = ob0Var3;
                    }
                    ob0Var4.p(z5);
                    joVar2 = joVar3;
                    ob0Var2 = ob0Var4;
                } else {
                    v41Var = v41Var3;
                }
                z2 = true;
                objK = ob0Var5.K();
                if (z2) {
                    i4 = i11;
                    objK = new d22(new xg0(k40VarM2), d22Var, d22Var.c.concat(" > EnterExitTransition"));
                    ob0Var5.f0(objK);
                    d22Var2 = (d22) objK;
                    if (i12 <= 4) {
                        zF = ((i12 <= 4 && ob0Var5.f(d22Var)) || (i4 & 6) == 4) | ob0Var5.f(d22Var2);
                        objK2 = ob0Var5.K();
                        if (zF) {
                            objK2 = new d(25, d22Var, d22Var2);
                            ob0Var5.f0(objK2);
                            wi0.c(d22Var2, (sa0) objK2, ob0Var5);
                            if (d22Var.g()) {
                            }
                            if (d22Var.g()) {
                            }
                            r22 r22Var22 = r40.a;
                            zF2 = ob0Var5.f(d22Var2);
                            objK3 = ob0Var5.K();
                            if (!zF2) {
                                objK3 = xc.B(w40Var);
                                ob0Var5.f0(objK3);
                                fy0 fy0Var22 = (fy0) objK3;
                                objC = d22Var2.c();
                                v41Var2 = d22Var2.d;
                                value = v41Var2.getValue();
                                k40Var = k40.g;
                                k40Var2 = k40.f;
                                if (objC == value) {
                                    if (v41Var2.getValue() != k40Var) {
                                    }
                                    w40Var2 = (w40) fy0Var22.getValue();
                                    zF3 = ob0Var5.f(d22Var2);
                                    objK4 = ob0Var5.K();
                                    if (!zF3) {
                                        objK4 = xc.B(j50Var);
                                        ob0Var5.f0(objK4);
                                        fy0 fy0Var32 = (fy0) objK4;
                                        if (d22Var2.c() == v41Var2.getValue()) {
                                            if (v41Var2.getValue() != k40Var2) {
                                            }
                                            j50Var2 = (j50) fy0Var32.getValue();
                                            fy0VarD = xc.D(wa0Var, ob0Var5);
                                            Object objH2 = wa0Var.h(d22Var2.c(), v41Var2.getValue());
                                            zF4 = ob0Var5.f(d22Var2) | ob0Var5.f(fy0VarD);
                                            objK5 = ob0Var5.K();
                                            if (!zF4) {
                                                objK5 = new g(d22Var2, fy0VarD, (ks) null, 1);
                                                ob0Var5.f0(objK5);
                                                wa0Var2 = (wa0) objK5;
                                                objK6 = ob0Var5.K();
                                                if (objK6 == l91Var) {
                                                }
                                                fy0Var = (fy0) objK6;
                                                zH = ob0Var5.h(wa0Var2);
                                                objK7 = ob0Var5.K();
                                                if (!zH) {
                                                    objK7 = new jq1(wa0Var2, fy0Var, null, 0);
                                                    ob0Var5.f0(objK7);
                                                    wi0.i((wa0) objK7, ob0Var5, t32.a);
                                                    if (d22Var2.c() != k40Var) {
                                                        ob0Var5.W(-272355980);
                                                        if (i7 != 4) {
                                                        }
                                                        objK8 = ob0Var5.K();
                                                        if (!z3) {
                                                            objK8 = new ra();
                                                            ob0Var5.f0(objK8);
                                                            ra raVar32 = (ra) objK8;
                                                            raVar32.b.getClass();
                                                            vn1Var = raVar32.b;
                                                            r22 r22Var32 = c2.V;
                                                            objK9 = ob0Var5.K();
                                                            if (objK9 == l91Var) {
                                                            }
                                                            ha0Var = (ha0) objK9;
                                                            ob0Var5.W(-1491182875);
                                                            ob0Var5.p(false);
                                                            ob0Var5.W(-1491180092);
                                                            ob0Var5.p(false);
                                                            if (vn1Var != null) {
                                                            }
                                                            ob0Var5.p(z4);
                                                            vn1Var.c(d22Var2.e.getValue() == null);
                                                            zH2 = ob0Var5.h(vn1Var);
                                                            objK10 = ob0Var5.K();
                                                            if (!zH2) {
                                                                objK10 = new a7(4, vn1Var);
                                                                ob0Var5.f0(objK10);
                                                                r40.a(d22Var2, (ha0) objK10, ob0Var5, 0);
                                                                e22 e22Var42 = w40Var2.a;
                                                                e22 e22Var52 = j50Var2.a;
                                                                zC = vl.c(vn1Var.e, vl.f);
                                                                vn1 vn1Var52 = vn1Var;
                                                                if (oh0.a(vn1Var.i, 0L)) {
                                                                }
                                                                ob0Var3.W(1018962109);
                                                                ob0Var3.p(z5);
                                                                ob0Var3.W(1019206141);
                                                                ob0Var3.p(z5);
                                                                boolean z122 = !false;
                                                                cf1 cf1Var2 = gm.e;
                                                                tv0 tv0Var62 = qv0.a;
                                                                if (zC) {
                                                                }
                                                                r22 r22Var52 = c2.P;
                                                                if (e22Var42.a != null) {
                                                                    if (e22Var42.b != null) {
                                                                        if (z7) {
                                                                        }
                                                                        if (z8) {
                                                                        }
                                                                        if (z8) {
                                                                        }
                                                                        zH3 = ob0Var3.h(z12Var3) | ob0Var3.f(w40Var2) | ob0Var3.f(j50Var3) | ob0Var3.h(vn1Var3) | ob0Var3.h(z12Var5) | ob0Var3.f(d22Var2) | ob0Var3.h(z12VarG);
                                                                        objK11 = ob0Var3.K();
                                                                        if (zH3) {
                                                                            vn1 vn1Var72 = vn1Var3;
                                                                            j50 j50Var52 = j50Var3;
                                                                            objK11 = new m40(z12Var3, vn1Var72, z12Var5, d22Var2, w40Var2, j50Var52, z12VarG);
                                                                            j50Var4 = j50Var52;
                                                                            vn1Var4 = vn1Var72;
                                                                            ob0Var3.f0(objK11);
                                                                            m40 m40Var2 = (m40) objK11;
                                                                            zG = ob0Var3.g(z6) | ob0Var3.f(ha0Var);
                                                                            objK12 = ob0Var3.K();
                                                                            if (!zG) {
                                                                                objK12 = new q40(z6, ha0Var);
                                                                                ob0Var3.f0(objK12);
                                                                                tv0 tv0VarC3 = c2.m(tv0Var2, (sa0) objK12).c(new l40(d22Var2, null, null, z12Var, w40Var2, j50Var4, vn1Var4, ha0Var, m40Var2)).c(tv0Var4);
                                                                                ob0Var3.W(-1255668613);
                                                                                ob0Var3.p(z5);
                                                                                tv0Var5 = tv0Var;
                                                                                tv0 tv0VarC22 = tv0Var5.c(tv0VarC3.c(tv0Var2));
                                                                                objK13 = ob0Var3.K();
                                                                                if (objK13 != l91Var) {
                                                                                }
                                                                                fa faVar2 = (fa) objK13;
                                                                                int iHashCode2 = Long.hashCode(ob0Var3.T);
                                                                                b61 b61VarL2 = ob0Var3.l();
                                                                                tv0 tv0VarP2 = bk.P(ob0Var3, tv0VarC22);
                                                                                ep.c.getClass();
                                                                                zp zpVar2 = dp.b;
                                                                                ob0Var3.Z();
                                                                                if (ob0Var3.S) {
                                                                                }
                                                                                xc.E(dp.f, ob0Var3, faVar2);
                                                                                xc.E(dp.e, ob0Var3, b61VarL2);
                                                                                xc.z(ob0Var3, Integer.valueOf(iHashCode2), dp.g);
                                                                                xc.C(ob0Var3, dp.h);
                                                                                xc.E(dp.d, ob0Var3, tv0VarP2);
                                                                                jo joVar52 = joVar;
                                                                                joVar52.f(raVar2, ob0Var3, Integer.valueOf((i6 >> 21) & 112));
                                                                                ob0Var3.p(true);
                                                                                ob0Var3.p(z5);
                                                                                joVar3 = joVar52;
                                                                                ob0Var4 = ob0Var3;
                                                                                ob0Var4.p(z5);
                                                                                joVar2 = joVar3;
                                                                                ob0Var2 = ob0Var4;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        zF = ((i12 <= 4 && ob0Var5.f(d22Var)) || (i4 & 6) == 4) | ob0Var5.f(d22Var2);
                        objK2 = ob0Var5.K();
                        if (zF) {
                        }
                    }
                }
            } else {
                ob0Var5.W(-270847985);
                ob0Var5.p(false);
                joVar2 = joVar4;
                ob0Var2 = ob0Var5;
            }
        } else {
            ob0Var5.Q();
            joVar2 = joVar4;
            ob0Var2 = ob0Var5;
        }
        dc1 dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
            dc1VarR.d = new la(d22Var, sa0Var, tv0Var5, w40Var, j50Var, wa0Var, joVar2, i2);
        }
    }

    public static final void b(boolean z2, tv0 tv0Var, w40 w40Var, j50 j50Var, String str, jo joVar, ob0 ob0Var, int i2) {
        int i3;
        String str2;
        ob0Var.X(-1448730565);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 |= ob0Var.f(w40Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ob0Var.f(j50Var) ? 2048 : 1024;
        }
        int i5 = i4 | 24576;
        if ((196608 & i2) == 0) {
            i5 |= ob0Var.h(joVar) ? 131072 : 65536;
        }
        if (ob0Var.N(i5 & 1, (74899 & i5) != 74898)) {
            d22 d22VarF = kd1.F(Boolean.valueOf(z2), "AnimatedVisibility", ob0Var, (i5 & 14) | ((i5 >> 9) & 112));
            Object objK = ob0Var.K();
            if (objK == kp.a) {
                objK = a4.s;
                ob0Var.f0(objK);
            }
            sa0 sa0Var = (sa0) objK;
            int i6 = i5 << 3;
            c(d22VarF, sa0Var, w40Var, j50Var, joVar, ob0Var, (i6 & 896) | 48 | (i6 & 7168) | (57344 & i6) | (i6 & 3670016));
            tv0Var = qv0.a;
            str2 = "AnimatedVisibility";
        } else {
            ob0Var.Q();
            str2 = str;
        }
        tv0 tv0Var2 = tv0Var;
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new na(z2, tv0Var2, w40Var, j50Var, str2, joVar, i2);
        }
    }

    public static final void c(d22 d22Var, sa0 sa0Var, w40 w40Var, j50 j50Var, jo joVar, ob0 ob0Var, int i2) {
        int i3;
        w40 w40Var2;
        j50 j50Var2;
        jo joVar2;
        ob0Var.X(-497872534);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.f(d22Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.h(sa0Var) ? 32 : 16;
        }
        int i4 = i2 & 384;
        qv0 qv0Var = qv0.a;
        if (i4 == 0) {
            i3 |= ob0Var.f(qv0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            w40Var2 = w40Var;
            i3 |= ob0Var.f(w40Var2) ? 2048 : 1024;
        } else {
            w40Var2 = w40Var;
        }
        if ((i2 & 24576) == 0) {
            j50Var2 = j50Var;
            i3 |= ob0Var.f(j50Var2) ? 16384 : 8192;
        } else {
            j50Var2 = j50Var;
        }
        int i5 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            joVar2 = joVar;
            i5 |= ob0Var.h(joVar2) ? 1048576 : 524288;
        } else {
            joVar2 = joVar;
        }
        if (ob0Var.N(i5 & 1, (599187 & i5) != 599186)) {
            int i6 = i5 & 112;
            int i7 = i5 & 14;
            boolean z2 = (i6 == 32) | (i7 == 4);
            Object objK = ob0Var.K();
            Object obj = kp.a;
            if (z2 || objK == obj) {
                objK = new oa(sa0Var, d22Var);
                ob0Var.f0(objK);
            }
            tv0 tv0VarY = y(qv0Var, (xa0) objK);
            Object objK2 = ob0Var.K();
            if (objK2 == obj) {
                objK2 = r9.h;
                ob0Var.f0(objK2);
            }
            int i8 = i7 | 196608 | i6 | (i5 & 7168) | (57344 & i5);
            int i9 = i5 << 6;
            w40 w40Var3 = w40Var2;
            a(d22Var, sa0Var, tv0VarY, w40Var3, j50Var2, (wa0) objK2, joVar2, ob0Var, (i9 & 234881024) | i8 | (29360128 & i9));
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new pa(d22Var, sa0Var, w40Var, j50Var, joVar, i2);
        }
    }

    public static tn1 d(int i2, ph phVar) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        int i4 = (i2 & 2) == 0 ? 16 : 0;
        if (i3 <= 0 && i4 <= 0 && phVar != ph.e) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + phVar).toString());
        }
        int i5 = i4 + i3;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new tn1(i3, i5, phVar);
    }

    public static final void e(ob0 ob0Var, int i2) {
        qt0 qt0VarE;
        ob0Var.X(803007873);
        if (ob0Var.N(i2 & 1, i2 != 0)) {
            t62 t62VarK = (t62) ob0Var.j(yr0.a);
            if (t62VarK == null) {
                ob0Var.W(1260197608);
                t62VarK = uc1.k((View) ob0Var.j(w4.f));
            } else {
                ob0Var.W(1260196492);
            }
            ob0Var.p(false);
            if (t62VarK == null) {
                yc.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            boolean z2 = t62VarK instanceof kd0;
            cu cuVarD = z2 ? ((bo) ((kd0) t62VarK)).d() : bu.b;
            mk mkVarA = ad1.a(lr0.class);
            if (z2) {
                bo boVar = (bo) t62VarK;
                et0 et0VarE = boVar.e();
                r62 r62Var = (r62) boVar.w.getValue();
                r62Var.getClass();
                cuVarD.getClass();
                qt0VarE = new qt0(et0VarE, r62Var, cuVarD);
            } else {
                qt0VarE = i32.e(t62VarK, null, 6);
            }
            vu vuVar = (vu) qt0VarE.f;
            String strB = mkVarA.b();
            if (strB == null) {
                yc.p("Local and anonymous classes can not be ViewModels");
                return;
            }
            pd1.f(false, lk.d0(611565042, new ud(2, (lr0) vuVar.h(mkVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB))), ob0Var), ob0Var, 48);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new pc(i2);
        }
    }

    public static final void f(List list, int i2, int i3) {
        int iR = r(i2, list);
        if (iR < 0) {
            iR = -(iR + 1);
        }
        while (iR < list.size() && ((hj0) list.get(iR)).b < i3) {
        }
    }

    public static final void g(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static Map h(Object obj) {
        if ((obj instanceof yj0) && !(obj instanceof ak0)) {
            N(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            xi0.H(e2, s22.class.getName());
            throw e2;
        }
    }

    public static void i(int i2, Object obj) {
        if (obj == null || w(i2, obj)) {
            return;
        }
        N(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static final Bundle j(j41... j41VarArr) {
        Bundle bundle = new Bundle(j41VarArr.length);
        for (j41 j41Var : j41VarArr) {
            String str = (String) j41Var.e;
            Object obj = j41Var.f;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void k(int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new rh0(2, 36, 1));
        }
    }

    public static tv0 l(tv0 tv0Var, jx0 jx0Var, vf1 vf1Var, boolean z2, yf1 yf1Var, ha0 ha0Var, int i2) {
        tv0 tv0VarC;
        if ((i2 & 16) != 0) {
            yf1Var = null;
        }
        yf1 yf1Var2 = yf1Var;
        if (vf1Var != null) {
            tv0VarC = new qk(jx0Var, vf1Var, false, z2, null, yf1Var2, ha0Var);
        } else if (vf1Var == null) {
            tv0VarC = new qk(jx0Var, null, false, z2, null, yf1Var2, ha0Var);
        } else {
            qv0 qv0Var = qv0.a;
            tv0VarC = jx0Var != null ? mf0.a(qv0Var, jx0Var, vf1Var).c(new qk(jx0Var, null, false, z2, null, yf1Var2, ha0Var)) : bk.q(qv0Var, new sk(vf1Var, z2, yf1Var2, ha0Var));
        }
        return tv0Var.c(tv0VarC);
    }

    public static tv0 m(tv0 tv0Var, boolean z2, String str, ha0 ha0Var) {
        return tv0Var.c(new qk(null, null, true, z2, str, null, ha0Var));
    }

    public static final void n(ip1 ip1Var, ArrayList arrayList, int i2) {
        boolean zL = ip1Var.l(i2);
        int[] iArr = ip1Var.b;
        if (zL) {
            arrayList.add(ip1Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            n(ip1Var, arrayList, i4);
        }
    }

    public static byte[] o(xx[] xxVarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (xx xxVar : xxVarArr) {
            length += ((((xxVar.g * 2) + 7) & (-8)) / 8) + (xxVar.e * 2) + s(xxVar.a, xxVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + xxVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, c2.x)) {
            int length2 = xxVarArr.length;
            while (i2 < length2) {
                xx xxVar2 = xxVarArr[i2];
                W(byteArrayOutputStream, xxVar2, s(xxVar2.a, xxVar2.b, bArr));
                V(byteArrayOutputStream, xxVar2);
                i2++;
            }
        } else {
            for (xx xxVar3 : xxVarArr) {
                W(byteArrayOutputStream, xxVar3, s(xxVar3.a, xxVar3.b, bArr));
            }
            int length3 = xxVarArr.length;
            while (i2 < length3) {
                V(byteArrayOutputStream, xxVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static final boolean p(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final v12 q(ez1 ez1Var, hb hbVar) {
        ez1Var.getClass();
        int length = hbVar.f.length();
        int length2 = hbVar.f.length();
        int iMin = Math.min(length, 100);
        for (int i2 = 0; i2 < iMin; i2++) {
            T(i2, length2, i2);
        }
        T(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i3 = 0; i3 < iMin2; i3++) {
            U(i3, length, i3);
        }
        U(length2, length, length2);
        return new v12(hbVar, new o50(hbVar.f.length(), hbVar.f.length()));
    }

    public static final int r(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iT = xi0.t(((hj0) list.get(i4)).b, i2);
            if (iT < 0) {
                i3 = i4 + 1;
            } else {
                if (iT <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static String s(String str, String str2, byte[] bArr) {
        byte[] bArr2 = c2.y;
        byte[] bArr3 = c2.z;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    public static final int t(aa0 aa0Var, int i2) {
        boolean z2 = xi0.t(aa0Var.e, aa0.f.e) >= 0;
        boolean z3 = i2 == 1;
        if (z3 && z2) {
            return 3;
        }
        if (z2) {
            return 1;
        }
        return z3 ? 2 : 0;
    }

    public static final xi u(ks ksVar) {
        if (!(ksVar instanceof my)) {
            return new xi(1, ksVar);
        }
        xi xiVarN = ((my) ksVar).n();
        if (xiVarN != null) {
            if (!xiVarN.E()) {
                xiVarN = null;
            }
            if (xiVarN != null) {
                return xiVarN;
            }
        }
        return new xi(2, ksVar);
    }

    public static final boolean v(KeyEvent keyEvent) {
        long jA = bl.A(keyEvent);
        int i2 = ek0.O;
        return ek0.a(jA, ek0.h) || ek0.a(jA, ek0.r) || ek0.a(jA, ek0.E) || ek0.a(jA, ek0.q);
    }

    public static boolean w(int i2, Object obj) {
        if (obj instanceof eb0) {
            if ((obj instanceof gb0 ? ((gb0) obj).c() : obj instanceof ha0 ? 0 : obj instanceof sa0 ? 1 : obj instanceof wa0 ? 2 : obj instanceof xa0 ? 3 : obj instanceof ya0 ? 4 : obj instanceof za0 ? 5 : obj instanceof ab0 ? 6 : obj instanceof bb0 ? 7 : obj instanceof cb0 ? 8 : obj instanceof db0 ? 9 : obj instanceof ia0 ? 10 : obj instanceof ja0 ? 11 : obj instanceof la0 ? 13 : obj instanceof ma0 ? 14 : obj instanceof na0 ? 15 : obj instanceof oa0 ? 16 : obj instanceof pa0 ? 17 : obj instanceof qa0 ? 18 : obj instanceof ra0 ? 19 : obj instanceof ta0 ? 20 : obj instanceof ua0 ? 21 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static final tv0 y(tv0 tv0Var, xa0 xa0Var) {
        return tv0Var.c(new bl0(xa0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long z(int i2, int i3, String str) {
        char cCharAt;
        int i4;
        long j2;
        char c2;
        char c3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        long j3;
        char c4;
        int i10;
        int i11;
        int i12;
        long j4 = 4294967295L;
        if (i2 == i3) {
            return (((long) i2) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
        }
        char cCharAt2 = str.charAt(i2);
        boolean z3 = cCharAt2 == '-';
        if (z3) {
            i4 = i2 + 1;
            if (i4 == i3) {
                return (((long) i4) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
            cCharAt = str.charAt(i4);
            if (((char) (cCharAt - '0')) >= '\n' && cCharAt != '.') {
                return (((long) i4) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
        } else {
            cCharAt = cCharAt2;
            i4 = i2;
        }
        int length = str.length();
        int i13 = i4;
        long j5 = 0;
        while (true) {
            if (i13 == i3) {
                j2 = j4;
                break;
            }
            j2 = j4;
            int i14 = cCharAt - '0';
            if (((char) i14) >= '\n') {
                break;
            }
            j5 = (j5 * 10) + ((long) i14);
            i13++;
            cCharAt = i13 < length ? str.charAt(i13) : (char) 0;
            j4 = j2;
        }
        int i15 = i13 - i4;
        char c5 = '0';
        if (i13 == i3 || cCharAt != '.') {
            c2 = ' ';
            c3 = 1;
            i5 = i13;
            i6 = i5;
            i7 = 0;
        } else {
            int i16 = i13 + 1;
            c2 = ' ';
            i5 = i16;
            while (true) {
                c3 = 1;
                if (i3 - i5 < 4) {
                    i12 = i16;
                    break;
                }
                i12 = i16;
                long jCharAt = ((long) str.charAt(i5)) | (((long) str.charAt(i5 + 1)) << 16) | (((long) str.charAt(i5 + 2)) << 32) | (((long) str.charAt(i5 + 3)) << 48);
                long j6 = jCharAt - 13511005043687472L;
                int i17 = (((jCharAt + 19703549022044230L) | j6) & (-35747867511423104L)) != 0 ? -1 : (int) ((j6 * 281475406208040961L) >>> 48);
                if (i17 < 0) {
                    break;
                }
                j5 = (j5 * 10000) + ((long) i17);
                i5 += 4;
                i16 = i12;
            }
            char cCharAt3 = i5 < length ? str.charAt(i5) : (char) 0;
            loop2: while (true) {
                cCharAt = cCharAt3;
                while (i5 != i3) {
                    int i18 = cCharAt - '0';
                    if (((char) i18) >= '\n') {
                        break loop2;
                    }
                    j5 = (j5 * 10) + ((long) i18);
                    i5++;
                    if (i5 < length) {
                        break;
                    }
                    cCharAt = 0;
                }
                cCharAt3 = str.charAt(i5);
            }
            i7 = i12 - i5;
            i15 -= i7;
            i6 = i12;
        }
        if (i15 == 0) {
            return (((long) i5) << c2) | (((long) Float.floatToRawIntBits(Float.NaN)) & j2);
        }
        if ((cCharAt | ' ') == 101) {
            i8 = i5 + 1;
            char cCharAt4 = i8 < length ? str.charAt(i8) : (char) 0;
            char c6 = cCharAt4 == '-' ? c3 : (char) 0;
            if (c6 != 0 || cCharAt4 == '+') {
                i8 = i5 + 2;
            }
            char cCharAt5 = str.charAt(i8);
            i9 = 0;
            while (true) {
                if (i8 == i3) {
                    i11 = i7;
                    break;
                }
                int i19 = cCharAt5 - c5;
                i11 = i7;
                if (((char) i19) >= '\n') {
                    break;
                }
                if (i9 < 1024) {
                    i9 = (i9 * 10) + i19;
                }
                i8++;
                cCharAt5 = i8 < length ? str.charAt(i8) : (char) 0;
                i7 = i11;
                c5 = '0';
            }
            if (c6 != 0) {
                i9 = -i9;
            }
            i7 = i11 + i9;
        } else {
            i8 = i5;
            i9 = 0;
        }
        int i20 = 19;
        if (i15 > 19) {
            char cCharAt6 = str.charAt(i4);
            int i21 = i4;
            while (true) {
                if (i8 == i3) {
                    i10 = i20;
                    break;
                }
                if (cCharAt6 != '0' && cCharAt6 != '.') {
                    i10 = 19;
                    break;
                }
                if (cCharAt6 == '0') {
                    i15--;
                }
                i21++;
                cCharAt6 = i21 < length ? str.charAt(i21) : (char) 0;
                i20 = 19;
            }
            if (i15 > i10) {
                char cCharAt7 = str.charAt(i4);
                z2 = z3;
                j3 = 0;
                while (i4 != i13 && Long.compareUnsigned(j3, 1000000000000000000L) < 0) {
                    j3 = (j3 * 10) + ((long) (cCharAt7 - '0'));
                    i4++;
                    cCharAt7 = i4 < length ? str.charAt(i4) : (char) 0;
                }
                if (Long.compareUnsigned(j3, 1000000000000000000L) >= 0) {
                    i7 = (i13 - i4) + i9;
                } else {
                    char cCharAt8 = str.charAt(i6);
                    int i22 = i6;
                    while (i22 != i5 && Long.compareUnsigned(j3, 1000000000000000000L) < 0) {
                        j3 = (j3 * 10) + ((long) (cCharAt8 - '0'));
                        i22++;
                        cCharAt8 = i22 < length ? str.charAt(i22) : (char) 0;
                    }
                    i7 = (i6 - i22) + i9;
                }
                c4 = c3;
            } else {
                z2 = z3;
                j3 = j5;
                c4 = 0;
            }
        }
        if (-10 <= i7 && i7 < 11 && c4 == 0 && Long.compareUnsigned(j3, 16777216L) <= 0) {
            float f2 = j3;
            float[] fArr = f;
            float f3 = i7 < 0 ? f2 / fArr[-i7] : f2 * fArr[i7];
            if (z2) {
                f3 = -f3;
            }
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(f3)) & j2);
        }
        if (j3 == 0) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(z2 ? -0.0f : 0.0f)) & j2);
        }
        if (-126 > i7 || i7 >= 128) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        long j7 = g[i7 + 325];
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j3);
        long j8 = j3 << iNumberOfLeadingZeros;
        long j9 = j8 & j2;
        long j10 = j8 >>> c2;
        long j11 = j7 & j2;
        long j12 = j7 >>> c2;
        long j13 = j10 * j12;
        long j14 = j12 * j9;
        long j15 = j13 + ((((j10 * j11) + ((j9 * j11) >>> c2)) + (j14 & j2)) >>> c2) + (j14 >>> c2);
        int i23 = (int) (j15 >>> 63);
        long j16 = j15 >>> (i23 + 9);
        int i24 = iNumberOfLeadingZeros + (i23 ^ 1);
        long j17 = j15 & 511;
        if (j17 == 511 || (j17 == 0 && (3 & j16) == 1)) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        long j18 = (j16 + 1) >>> c3;
        if (j18 >= 9007199254740992L) {
            i24--;
            j18 = 4503599627370496L;
        }
        long j19 = j18 & (-4503599627370497L);
        long j20 = (((((long) i7) * 217706) >> 16) + 1087) - ((long) i24);
        if (j20 < 1 || j20 > 2046) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        return (((long) i8) << c2) | (((long) Float.floatToRawIntBits((float) Double.longBitsToDouble((j20 << 52) | j19 | (z2 ? Long.MIN_VALUE : 0L)))) & j2);
    }
}
