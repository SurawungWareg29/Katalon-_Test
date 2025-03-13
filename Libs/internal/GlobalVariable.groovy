package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object corpId
     
    /**
     * <p></p>
     */
    public static Object userId
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object AmountTransfer
     
    /**
     * <p></p>
     */
    public static Object RekeningTujuan
     
    /**
     * <p></p>
     */
    public static Object BankTujuan
     
    /**
     * <p></p>
     */
    public static Object RekeningTujuanFix
     
    /**
     * <p></p>
     */
    public static Object AmountTransferFix
     
    /**
     * <p></p>
     */
    public static Object ValidasiNoRekHalamanBankLain
     
    /**
     * <p></p>
     */
    public static Object berita
     
    /**
     * <p></p>
     */
    public static Object biayaTransaksi
     
    /**
     * <p></p>
     */
    public static Object biayaAdmin
     
    /**
     * <p></p>
     */
    public static Object totalBiaya
     
    /**
     * <p></p>
     */
    public static Object totalTransaksi
     
    /**
     * <p></p>
     */
    public static Object AmountTransferInRupiahFormat
     
    /**
     * <p></p>
     */
    public static Object jenisTransfer
     
    /**
     * <p></p>
     */
    public static Object jenisTransaksi
     
    /**
     * <p></p>
     */
    public static Object ValidasiNoRekHalamanResi
     
    /**
     * <p></p>
     */
    public static Object ValidasiNoRekTujuanHalamanResi
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            corpId = selectedVariables['corpId']
            userId = selectedVariables['userId']
            password = selectedVariables['password']
            url = selectedVariables['url']
            AmountTransfer = selectedVariables['AmountTransfer']
            RekeningTujuan = selectedVariables['RekeningTujuan']
            BankTujuan = selectedVariables['BankTujuan']
            RekeningTujuanFix = selectedVariables['RekeningTujuanFix']
            AmountTransferFix = selectedVariables['AmountTransferFix']
            ValidasiNoRekHalamanBankLain = selectedVariables['ValidasiNoRekHalamanBankLain']
            berita = selectedVariables['berita']
            biayaTransaksi = selectedVariables['biayaTransaksi']
            biayaAdmin = selectedVariables['biayaAdmin']
            totalBiaya = selectedVariables['totalBiaya']
            totalTransaksi = selectedVariables['totalTransaksi']
            AmountTransferInRupiahFormat = selectedVariables['AmountTransferInRupiahFormat']
            jenisTransfer = selectedVariables['jenisTransfer']
            jenisTransaksi = selectedVariables['jenisTransaksi']
            ValidasiNoRekHalamanResi = selectedVariables['ValidasiNoRekHalamanResi']
            ValidasiNoRekTujuanHalamanResi = selectedVariables['ValidasiNoRekTujuanHalamanResi']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
