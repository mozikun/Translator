package com.github.onlynight.android.string_xml.translate.translator;

/**
 * Created by lion on 2016/10/28.
 * 语言简写配置，目前的几种语言使用的是google翻译的标准
 */
public enum Language {
    AF("af"),
    SQ("sq"),
    AR("ar"),
    HY("hy"),
    AZ("az"),
    EU("eu"),
    BE("be"),
    BN("bn"),
    BS("bs"),
    BG("bg"),
    CA("ca"),
    CEB("ceb"),
    NY("ny"),
    ZH_CN("zh-CN"),
    ZH_TW("zh-TW"),
    HR("hr"),
    CS("cs"),
    DA("da"),
    NL("nl"),
    EN("en"),
    EO("eo"),
    ET("et"),
    TL("tl"),
    FI("fi"),
    FR("fr"),
    GL("gl"),
    KA("ka"),
    DE("de"),
    EL("el"),
    GU("gu"),
    HT("ht"),
    HA("ha"),
    IW("iw"),
    HI("hi"),
    HMN("hmn"),
    HU("hu"),
    IS("is"),
    IG("ig"),
    ID("id"),
    GA("ga"),
    IT("it"),
    JA("ja"),
    JW("jw"),
    KN("kn"),
    KK("kk"),
    KM("km"),
    KO("ko"),
    LO("lo"),
    LA("la"),
    LV("lv"),
    LT("lt"),
    MK("mk"),
    MG("mg"),
    MS("ms"),
    ML("ml"),
    MT("mt"),
    MI("mi"),
    MR("mr"),
    MN("mn"),
    MY("my"),
    NE("ne"),
    NO("no"),
    FA("fa"),
    PL("pl"),
    PT("pt"),
    RO("ro"),
    RU("ru"),
    SR("sr"),
    ST("st"),
    SI("si"),
    SK("sk"),
    SL("sl"),
    SO("so"),
    ES("es"),
    SU("su"),
    SW("sw"),
    SV("sv"),
    TG("tg"),
    TA("ta"),
    TE("te"),
    TH("th"),
    TR("tr"),
    UK("uk"),
    UR("ur"),
    UZ("uz"),
    VI("vi"),
    CY("cy"),
    YI("yi"),
    YO("yo"),
    ZU("zu");

    private String value;

    public String getValue() {
        return value;
    }

    Language(String value) {
        this.value = value;
    }
}