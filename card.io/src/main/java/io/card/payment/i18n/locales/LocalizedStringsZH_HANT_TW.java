package io.card.payment.i18n.locales;

import java.util.HashMap;
import java.util.Map;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;

// Class autogenerated!  Do not modify.
// Generated on 2014-12-10 11:29:25.183955 via script:
// /Users/twhipple/Documents/buffalo/lib-i18n/i18n/script/generate_android_i18n.py -java_src_path src/ -java_gen_path gen/ -stringkey_path io/card/payment/i18n/ -strings_path ../strings/projects/card.io/strings/ --strict

public class LocalizedStringsZH_HANT_TW implements SupportedLocale<StringKey> {

    private static Map<StringKey, String> mDisplay = new HashMap<StringKey, String>();
    private static Map<String, String> mAdapted = new HashMap<String, String>();

    @Override
    public String getName() {
        return "zh-Hant_TW";
    }

    @Override
    public String getAdaptedDisplay(StringKey key, String country) {
        String adaptedKey = key.toString() + "|" + country;
        if (mAdapted.containsKey(adaptedKey)) {
            return mAdapted.get(adaptedKey);
        } else {
            return mDisplay.get(key);
        }
    }

    public LocalizedStringsZH_HANT_TW() {
        mDisplay.put(StringKey.CANCEL, "取消");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "美國運通");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "完成");
        mDisplay.put(StringKey.ENTRY_CVV, "信用卡驗證碼");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "郵遞區號");
        mDisplay.put(StringKey.ENTRY_NAME_ON_CARD, "持卡人姓名");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "到期日");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "月 / 年");
        mDisplay.put(StringKey.SCAN_GUIDE, "將信用卡放在此處。\n系統將自動掃描。");
        mDisplay.put(StringKey.KEYBOARD, "鍵盤…");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "卡號");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "信用卡詳細資料");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "此裝置無法使用相機讀取卡號。");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "無法使用相機。");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "啟動相機時發生意外的錯誤。");

        // no adapted_translations found
    }
}
