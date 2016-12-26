package preju.controledefrequencia.Beans;

import java.io.Serializable;
import java.util.List;


public class FrequenciaBean implements Serializable {


    public FrequenciaBean() {
    }


    String ME_1,ME_2,ME_3,ME_4,ME_5,ME_6,ME_7,ME_8,ME_9,ME_10,ME_11,ME_12,ME_13,ME_14,ME_15,ME_16,ME_17,ME_18,ME_19,ME_20,ME_21,ME_22,ME_23,ME_24,ME_25,ME_26,ME_27,ME_28,ME_29,ME_30,ME_31;
    String MS_1,MS_2,MS_3,MS_4,MS_5,MS_6,MS_7,MS_8,MS_9,MS_10,MS_11,MS_12,MS_13,MS_14,MS_15,MS_16,MS_17,MS_18,MS_19,MS_20,MS_21,MS_22,MS_23,MS_24,MS_25,MS_26,MS_27,MS_28,MS_29,MS_30,MS_31;
    String TE_1,TE_2,TE_3,TE_4,TE_5,TE_6,TE_7,TE_8,TE_9,TE_10,TE_11,TE_12,TE_13,TE_14,TE_15,TE_16,TE_17,TE_18,TE_19,TE_20,TE_21,TE_22,TE_23,TE_24,TE_25,TE_26,TE_27,TE_28,TE_29,TE_30,TE_31;
    String TS_1,TS_2,TS_3,TS_4,TS_5,TS_6,TS_7,TS_8,TS_9,TS_10,TS_11,TS_12,TS_13,TS_14,TS_15,TS_16,TS_17,TS_18,TS_19,TS_20,TS_21,TS_22,TS_23,TS_24,TS_25,TS_26,TS_27,TS_28,TS_29,TS_30,TS_31;
    String EE_1,EE_2,EE_3,EE_4,EE_5,EE_6,EE_7,EE_8,EE_9,EE_10,EE_11,EE_12,EE_13,EE_14,EE_15,EE_16,EE_17,EE_18,EE_19,EE_20,EE_21,EE_22,EE_23,EE_24,EE_25,EE_26,EE_27,EE_28,EE_29,EE_30,EE_31;
    String ES_1,ES_2,ES_3,ES_4,ES_5,ES_6,ES_7,ES_8,ES_9,ES_10,ES_11,ES_12,ES_13,ES_14,ES_15,ES_16,ES_17,ES_18,ES_19,ES_20,ES_21,ES_22,ES_23,ES_24,ES_25,ES_26,ES_27,ES_28,ES_29,ES_30,ES_31;
    String E4_1,E4_2,E4_3,E4_4,E4_5,E4_6,E4_7,E4_8,E4_9,E4_10,E4_11,E4_12,E4_13,E4_14,E4_15,E4_16,E4_17,E4_18,E4_19,E4_20,E4_21,E4_22,E4_23,E4_24,E4_25,E4_26,E4_27,E4_28,E4_29,E4_30,E4_31;
    String S4_1,S4_2,S4_3,S4_4,S4_5,S4_6,S4_7,S4_8,S4_9,S4_10,S4_11,S4_12,S4_13,S4_14,S4_15,S4_16,S4_17,S4_18,S4_19,S4_20,S4_21,S4_22,S4_23,S4_24,S4_25,S4_26,S4_27,S4_28,S4_29,S4_30,S4_31;
    String E5_1,E5_2,E5_3,E5_4,E5_5,E5_6,E5_7,E5_8,E5_9,E5_10,E5_11,E5_12,E5_13,E5_14,E5_15,E5_16,E5_17,E5_18,E5_19,E5_20,E5_21,E5_22,E5_23,E5_24,E5_25,E5_26,E5_27,E5_28,E5_29,E5_30,E5_31;
    String S5_1,S5_2,S5_3,S5_4,S5_5,S5_6,S5_7,S5_8,S5_9,S5_10,S5_11,S5_12,S5_13,S5_14,S5_15,S5_16,S5_17,S5_18,S5_19,S5_20,S5_21,S5_22,S5_23,S5_24,S5_25,S5_26,S5_27,S5_28,S5_29,S5_30,S5_31;
    String Obs_1,Obs_2,Obs_3,Obs_4,Obs_5,Obs_6,Obs_7,Obs_8,Obs_9,Obs_10,Obs_11,Obs_12,Obs_13,Obs_14,Obs_15,Obs_16,Obs_17,Obs_18,Obs_19,Obs_20,Obs_21,Obs_22,Obs_23,Obs_24,Obs_25,Obs_26,Obs_27,Obs_28,Obs_29,Obs_30,Obs_31;
    String Total_1,Total_2,Total_3,Total_4,Total_5,Total_6,Total_7,Total_8,Total_9,Total_10,Total_11,Total_12,Total_13,Total_14,Total_15,Total_16,Total_17,Total_18,Total_19,Total_20,Total_21,Total_22,Total_23,Total_24,Total_25,Total_26,Total_27,Total_28,Total_29,Total_30,Total_31;

    String Colaborador, Status, DocID, ControlePonto, flagNotifSemPonto, Departamento,
            QUINZENA, LiberaEmissao, UserID, TotalHrsUteisMes, TotalHrTrab,Verifica;

    List<String> Historico;

    public List<String> getHistorico() {
        return Historico;
    }

    public void setHistorico(List<String> historico) {
        Historico = historico;
    }

    public String getVerifica() {
        return Verifica;
    }

    public void setVerifica(String verifica) {
        Verifica = verifica;
    }

    public String getME_1() {
        return ME_1;
    }

    public void setME_1(String ME_1) {
        this.ME_1 = ME_1;
    }

    public String getME_2() {
        return ME_2;
    }

    public void setME_2(String ME_2) {
        this.ME_2 = ME_2;
    }

    public String getME_3() {
        return ME_3;
    }

    public void setME_3(String ME_3) {
        this.ME_3 = ME_3;
    }

    public String getME_4() {
        return ME_4;
    }

    public void setME_4(String ME_4) {
        this.ME_4 = ME_4;
    }

    public String getME_5() {
        return ME_5;
    }

    public void setME_5(String ME_5) {
        this.ME_5 = ME_5;
    }

    public String getME_6() {
        return ME_6;
    }

    public void setME_6(String ME_6) {
        this.ME_6 = ME_6;
    }

    public String getME_7() {
        return ME_7;
    }

    public void setME_7(String ME_7) {
        this.ME_7 = ME_7;
    }

    public String getME_8() {
        return ME_8;
    }

    public void setME_8(String ME_8) {
        this.ME_8 = ME_8;
    }

    public String getME_9() {
        return ME_9;
    }

    public void setME_9(String ME_9) {
        this.ME_9 = ME_9;
    }

    public String getME_10() {
        return ME_10;
    }

    public void setME_10(String ME_10) {
        this.ME_10 = ME_10;
    }

    public String getME_11() {
        return ME_11;
    }

    public void setME_11(String ME_11) {
        this.ME_11 = ME_11;
    }

    public String getME_12() {
        return ME_12;
    }

    public void setME_12(String ME_12) {
        this.ME_12 = ME_12;
    }

    public String getME_13() {
        return ME_13;
    }

    public void setME_13(String ME_13) {
        this.ME_13 = ME_13;
    }

    public String getME_14() {
        return ME_14;
    }

    public void setME_14(String ME_14) {
        this.ME_14 = ME_14;
    }

    public String getME_15() {
        return ME_15;
    }

    public void setME_15(String ME_15) {
        this.ME_15 = ME_15;
    }

    public String getME_16() {
        return ME_16;
    }

    public void setME_16(String ME_16) {
        this.ME_16 = ME_16;
    }

    public String getME_17() {
        return ME_17;
    }

    public void setME_17(String ME_17) {
        this.ME_17 = ME_17;
    }

    public String getME_18() {
        return ME_18;
    }

    public void setME_18(String ME_18) {
        this.ME_18 = ME_18;
    }

    public String getME_19() {
        return ME_19;
    }

    public void setME_19(String ME_19) {
        this.ME_19 = ME_19;
    }

    public String getME_20() {
        return ME_20;
    }

    public void setME_20(String ME_20) {
        this.ME_20 = ME_20;
    }

    public String getME_21() {
        return ME_21;
    }

    public void setME_21(String ME_21) {
        this.ME_21 = ME_21;
    }

    public String getME_22() {
        return ME_22;
    }

    public void setME_22(String ME_22) {
        this.ME_22 = ME_22;
    }

    public String getME_23() {
        return ME_23;
    }

    public void setME_23(String ME_23) {
        this.ME_23 = ME_23;
    }

    public String getME_24() {
        return ME_24;
    }

    public void setME_24(String ME_24) {
        this.ME_24 = ME_24;
    }

    public String getME_25() {
        return ME_25;
    }

    public void setME_25(String ME_25) {
        this.ME_25 = ME_25;
    }

    public String getME_26() {
        return ME_26;
    }

    public void setME_26(String ME_26) {
        this.ME_26 = ME_26;
    }

    public String getME_27() {
        return ME_27;
    }

    public void setME_27(String ME_27) {
        this.ME_27 = ME_27;
    }

    public String getME_28() {
        return ME_28;
    }

    public void setME_28(String ME_28) {
        this.ME_28 = ME_28;
    }

    public String getME_29() {
        return ME_29;
    }

    public void setME_29(String ME_29) {
        this.ME_29 = ME_29;
    }

    public String getME_30() {
        return ME_30;
    }

    public void setME_30(String ME_30) {
        this.ME_30 = ME_30;
    }

    public String getME_31() {
        return ME_31;
    }

    public void setME_31(String ME_31) {
        this.ME_31 = ME_31;
    }

    public String getMS_1() {
        return MS_1;
    }

    public void setMS_1(String MS_1) {
        this.MS_1 = MS_1;
    }

    public String getMS_2() {
        return MS_2;
    }

    public void setMS_2(String MS_2) {
        this.MS_2 = MS_2;
    }

    public String getMS_3() {
        return MS_3;
    }

    public void setMS_3(String MS_3) {
        this.MS_3 = MS_3;
    }

    public String getMS_4() {
        return MS_4;
    }

    public void setMS_4(String MS_4) {
        this.MS_4 = MS_4;
    }

    public String getMS_5() {
        return MS_5;
    }

    public void setMS_5(String MS_5) {
        this.MS_5 = MS_5;
    }

    public String getMS_6() {
        return MS_6;
    }

    public void setMS_6(String MS_6) {
        this.MS_6 = MS_6;
    }

    public String getMS_7() {
        return MS_7;
    }

    public void setMS_7(String MS_7) {
        this.MS_7 = MS_7;
    }

    public String getMS_8() {
        return MS_8;
    }

    public void setMS_8(String MS_8) {
        this.MS_8 = MS_8;
    }

    public String getMS_9() {
        return MS_9;
    }

    public void setMS_9(String MS_9) {
        this.MS_9 = MS_9;
    }

    public String getMS_10() {
        return MS_10;
    }

    public void setMS_10(String MS_10) {
        this.MS_10 = MS_10;
    }

    public String getMS_11() {
        return MS_11;
    }

    public void setMS_11(String MS_11) {
        this.MS_11 = MS_11;
    }

    public String getMS_12() {
        return MS_12;
    }

    public void setMS_12(String MS_12) {
        this.MS_12 = MS_12;
    }

    public String getMS_13() {
        return MS_13;
    }

    public void setMS_13(String MS_13) {
        this.MS_13 = MS_13;
    }

    public String getMS_14() {
        return MS_14;
    }

    public void setMS_14(String MS_14) {
        this.MS_14 = MS_14;
    }

    public String getMS_15() {
        return MS_15;
    }

    public void setMS_15(String MS_15) {
        this.MS_15 = MS_15;
    }

    public String getMS_16() {
        return MS_16;
    }

    public void setMS_16(String MS_16) {
        this.MS_16 = MS_16;
    }

    public String getMS_17() {
        return MS_17;
    }

    public void setMS_17(String MS_17) {
        this.MS_17 = MS_17;
    }

    public String getMS_18() {
        return MS_18;
    }

    public void setMS_18(String MS_18) {
        this.MS_18 = MS_18;
    }

    public String getMS_19() {
        return MS_19;
    }

    public void setMS_19(String MS_19) {
        this.MS_19 = MS_19;
    }

    public String getMS_20() {
        return MS_20;
    }

    public void setMS_20(String MS_20) {
        this.MS_20 = MS_20;
    }

    public String getMS_21() {
        return MS_21;
    }

    public void setMS_21(String MS_21) {
        this.MS_21 = MS_21;
    }

    public String getMS_22() {
        return MS_22;
    }

    public void setMS_22(String MS_22) {
        this.MS_22 = MS_22;
    }

    public String getMS_23() {
        return MS_23;
    }

    public void setMS_23(String MS_23) {
        this.MS_23 = MS_23;
    }

    public String getMS_24() {
        return MS_24;
    }

    public void setMS_24(String MS_24) {
        this.MS_24 = MS_24;
    }

    public String getMS_25() {
        return MS_25;
    }

    public void setMS_25(String MS_25) {
        this.MS_25 = MS_25;
    }

    public String getMS_26() {
        return MS_26;
    }

    public void setMS_26(String MS_26) {
        this.MS_26 = MS_26;
    }

    public String getMS_27() {
        return MS_27;
    }

    public void setMS_27(String MS_27) {
        this.MS_27 = MS_27;
    }

    public String getMS_28() {
        return MS_28;
    }

    public void setMS_28(String MS_28) {
        this.MS_28 = MS_28;
    }

    public String getMS_29() {
        return MS_29;
    }

    public void setMS_29(String MS_29) {
        this.MS_29 = MS_29;
    }

    public String getMS_30() {
        return MS_30;
    }

    public void setMS_30(String MS_30) {
        this.MS_30 = MS_30;
    }

    public String getMS_31() {
        return MS_31;
    }

    public void setMS_31(String MS_31) {
        this.MS_31 = MS_31;
    }

    public String getTE_1() {
        return TE_1;
    }

    public void setTE_1(String TE_1) {
        this.TE_1 = TE_1;
    }

    public String getTE_2() {
        return TE_2;
    }

    public void setTE_2(String TE_2) {
        this.TE_2 = TE_2;
    }

    public String getTE_3() {
        return TE_3;
    }

    public void setTE_3(String TE_3) {
        this.TE_3 = TE_3;
    }

    public String getTE_4() {
        return TE_4;
    }

    public void setTE_4(String TE_4) {
        this.TE_4 = TE_4;
    }

    public String getTE_5() {
        return TE_5;
    }

    public void setTE_5(String TE_5) {
        this.TE_5 = TE_5;
    }

    public String getTE_6() {
        return TE_6;
    }

    public void setTE_6(String TE_6) {
        this.TE_6 = TE_6;
    }

    public String getTE_7() {
        return TE_7;
    }

    public void setTE_7(String TE_7) {
        this.TE_7 = TE_7;
    }

    public String getTE_8() {
        return TE_8;
    }

    public void setTE_8(String TE_8) {
        this.TE_8 = TE_8;
    }

    public String getTE_9() {
        return TE_9;
    }

    public void setTE_9(String TE_9) {
        this.TE_9 = TE_9;
    }

    public String getTE_10() {
        return TE_10;
    }

    public void setTE_10(String TE_10) {
        this.TE_10 = TE_10;
    }

    public String getTE_11() {
        return TE_11;
    }

    public void setTE_11(String TE_11) {
        this.TE_11 = TE_11;
    }

    public String getTE_12() {
        return TE_12;
    }

    public void setTE_12(String TE_12) {
        this.TE_12 = TE_12;
    }

    public String getTE_13() {
        return TE_13;
    }

    public void setTE_13(String TE_13) {
        this.TE_13 = TE_13;
    }

    public String getTE_14() {
        return TE_14;
    }

    public void setTE_14(String TE_14) {
        this.TE_14 = TE_14;
    }

    public String getTE_15() {
        return TE_15;
    }

    public void setTE_15(String TE_15) {
        this.TE_15 = TE_15;
    }

    public String getTE_16() {
        return TE_16;
    }

    public void setTE_16(String TE_16) {
        this.TE_16 = TE_16;
    }

    public String getTE_17() {
        return TE_17;
    }

    public void setTE_17(String TE_17) {
        this.TE_17 = TE_17;
    }

    public String getTE_18() {
        return TE_18;
    }

    public void setTE_18(String TE_18) {
        this.TE_18 = TE_18;
    }

    public String getTE_19() {
        return TE_19;
    }

    public void setTE_19(String TE_19) {
        this.TE_19 = TE_19;
    }

    public String getTE_20() {
        return TE_20;
    }

    public void setTE_20(String TE_20) {
        this.TE_20 = TE_20;
    }

    public String getTE_21() {
        return TE_21;
    }

    public void setTE_21(String TE_21) {
        this.TE_21 = TE_21;
    }

    public String getTE_22() {
        return TE_22;
    }

    public void setTE_22(String TE_22) {
        this.TE_22 = TE_22;
    }

    public String getTE_23() {
        return TE_23;
    }

    public void setTE_23(String TE_23) {
        this.TE_23 = TE_23;
    }

    public String getTE_24() {
        return TE_24;
    }

    public void setTE_24(String TE_24) {
        this.TE_24 = TE_24;
    }

    public String getTE_25() {
        return TE_25;
    }

    public void setTE_25(String TE_25) {
        this.TE_25 = TE_25;
    }

    public String getTE_26() {
        return TE_26;
    }

    public void setTE_26(String TE_26) {
        this.TE_26 = TE_26;
    }

    public String getTE_27() {
        return TE_27;
    }

    public void setTE_27(String TE_27) {
        this.TE_27 = TE_27;
    }

    public String getTE_28() {
        return TE_28;
    }

    public void setTE_28(String TE_28) {
        this.TE_28 = TE_28;
    }

    public String getTE_29() {
        return TE_29;
    }

    public void setTE_29(String TE_29) {
        this.TE_29 = TE_29;
    }

    public String getTE_30() {
        return TE_30;
    }

    public void setTE_30(String TE_30) {
        this.TE_30 = TE_30;
    }

    public String getTE_31() {
        return TE_31;
    }

    public void setTE_31(String TE_31) {
        this.TE_31 = TE_31;
    }

    public String getTS_1() {
        return TS_1;
    }

    public void setTS_1(String TS_1) {
        this.TS_1 = TS_1;
    }

    public String getTS_2() {
        return TS_2;
    }

    public void setTS_2(String TS_2) {
        this.TS_2 = TS_2;
    }

    public String getTS_3() {
        return TS_3;
    }

    public void setTS_3(String TS_3) {
        this.TS_3 = TS_3;
    }

    public String getTS_4() {
        return TS_4;
    }

    public void setTS_4(String TS_4) {
        this.TS_4 = TS_4;
    }

    public String getTS_5() {
        return TS_5;
    }

    public void setTS_5(String TS_5) {
        this.TS_5 = TS_5;
    }

    public String getTS_6() {
        return TS_6;
    }

    public void setTS_6(String TS_6) {
        this.TS_6 = TS_6;
    }

    public String getTS_7() {
        return TS_7;
    }

    public void setTS_7(String TS_7) {
        this.TS_7 = TS_7;
    }

    public String getTS_8() {
        return TS_8;
    }

    public void setTS_8(String TS_8) {
        this.TS_8 = TS_8;
    }

    public String getTS_9() {
        return TS_9;
    }

    public void setTS_9(String TS_9) {
        this.TS_9 = TS_9;
    }

    public String getTS_10() {
        return TS_10;
    }

    public void setTS_10(String TS_10) {
        this.TS_10 = TS_10;
    }

    public String getTS_11() {
        return TS_11;
    }

    public void setTS_11(String TS_11) {
        this.TS_11 = TS_11;
    }

    public String getTS_12() {
        return TS_12;
    }

    public void setTS_12(String TS_12) {
        this.TS_12 = TS_12;
    }

    public String getTS_13() {
        return TS_13;
    }

    public void setTS_13(String TS_13) {
        this.TS_13 = TS_13;
    }

    public String getTS_14() {
        return TS_14;
    }

    public void setTS_14(String TS_14) {
        this.TS_14 = TS_14;
    }

    public String getTS_15() {
        return TS_15;
    }

    public void setTS_15(String TS_15) {
        this.TS_15 = TS_15;
    }

    public String getTS_16() {
        return TS_16;
    }

    public void setTS_16(String TS_16) {
        this.TS_16 = TS_16;
    }

    public String getTS_17() {
        return TS_17;
    }

    public void setTS_17(String TS_17) {
        this.TS_17 = TS_17;
    }

    public String getTS_18() {
        return TS_18;
    }

    public void setTS_18(String TS_18) {
        this.TS_18 = TS_18;
    }

    public String getTS_19() {
        return TS_19;
    }

    public void setTS_19(String TS_19) {
        this.TS_19 = TS_19;
    }

    public String getTS_20() {
        return TS_20;
    }

    public void setTS_20(String TS_20) {
        this.TS_20 = TS_20;
    }

    public String getTS_21() {
        return TS_21;
    }

    public void setTS_21(String TS_21) {
        this.TS_21 = TS_21;
    }

    public String getTS_22() {
        return TS_22;
    }

    public void setTS_22(String TS_22) {
        this.TS_22 = TS_22;
    }

    public String getTS_23() {
        return TS_23;
    }

    public void setTS_23(String TS_23) {
        this.TS_23 = TS_23;
    }

    public String getTS_24() {
        return TS_24;
    }

    public void setTS_24(String TS_24) {
        this.TS_24 = TS_24;
    }

    public String getTS_25() {
        return TS_25;
    }

    public void setTS_25(String TS_25) {
        this.TS_25 = TS_25;
    }

    public String getTS_26() {
        return TS_26;
    }

    public void setTS_26(String TS_26) {
        this.TS_26 = TS_26;
    }

    public String getTS_27() {
        return TS_27;
    }

    public void setTS_27(String TS_27) {
        this.TS_27 = TS_27;
    }

    public String getTS_28() {
        return TS_28;
    }

    public void setTS_28(String TS_28) {
        this.TS_28 = TS_28;
    }

    public String getTS_29() {
        return TS_29;
    }

    public void setTS_29(String TS_29) {
        this.TS_29 = TS_29;
    }

    public String getTS_30() {
        return TS_30;
    }

    public void setTS_30(String TS_30) {
        this.TS_30 = TS_30;
    }

    public String getTS_31() {
        return TS_31;
    }

    public void setTS_31(String TS_31) {
        this.TS_31 = TS_31;
    }

    public String getEE_1() {
        return EE_1;
    }

    public void setEE_1(String EE_1) {
        this.EE_1 = EE_1;
    }

    public String getEE_2() {
        return EE_2;
    }

    public void setEE_2(String EE_2) {
        this.EE_2 = EE_2;
    }

    public String getEE_3() {
        return EE_3;
    }

    public void setEE_3(String EE_3) {
        this.EE_3 = EE_3;
    }

    public String getEE_4() {
        return EE_4;
    }

    public void setEE_4(String EE_4) {
        this.EE_4 = EE_4;
    }

    public String getEE_5() {
        return EE_5;
    }

    public void setEE_5(String EE_5) {
        this.EE_5 = EE_5;
    }

    public String getEE_6() {
        return EE_6;
    }

    public void setEE_6(String EE_6) {
        this.EE_6 = EE_6;
    }

    public String getEE_7() {
        return EE_7;
    }

    public void setEE_7(String EE_7) {
        this.EE_7 = EE_7;
    }

    public String getEE_8() {
        return EE_8;
    }

    public void setEE_8(String EE_8) {
        this.EE_8 = EE_8;
    }

    public String getEE_9() {
        return EE_9;
    }

    public void setEE_9(String EE_9) {
        this.EE_9 = EE_9;
    }

    public String getEE_10() {
        return EE_10;
    }

    public void setEE_10(String EE_10) {
        this.EE_10 = EE_10;
    }

    public String getEE_11() {
        return EE_11;
    }

    public void setEE_11(String EE_11) {
        this.EE_11 = EE_11;
    }

    public String getEE_12() {
        return EE_12;
    }

    public void setEE_12(String EE_12) {
        this.EE_12 = EE_12;
    }

    public String getEE_13() {
        return EE_13;
    }

    public void setEE_13(String EE_13) {
        this.EE_13 = EE_13;
    }

    public String getEE_14() {
        return EE_14;
    }

    public void setEE_14(String EE_14) {
        this.EE_14 = EE_14;
    }

    public String getEE_15() {
        return EE_15;
    }

    public void setEE_15(String EE_15) {
        this.EE_15 = EE_15;
    }

    public String getEE_16() {
        return EE_16;
    }

    public void setEE_16(String EE_16) {
        this.EE_16 = EE_16;
    }

    public String getEE_17() {
        return EE_17;
    }

    public void setEE_17(String EE_17) {
        this.EE_17 = EE_17;
    }

    public String getEE_18() {
        return EE_18;
    }

    public void setEE_18(String EE_18) {
        this.EE_18 = EE_18;
    }

    public String getEE_19() {
        return EE_19;
    }

    public void setEE_19(String EE_19) {
        this.EE_19 = EE_19;
    }

    public String getEE_20() {
        return EE_20;
    }

    public void setEE_20(String EE_20) {
        this.EE_20 = EE_20;
    }

    public String getEE_21() {
        return EE_21;
    }

    public void setEE_21(String EE_21) {
        this.EE_21 = EE_21;
    }

    public String getEE_22() {
        return EE_22;
    }

    public void setEE_22(String EE_22) {
        this.EE_22 = EE_22;
    }

    public String getEE_23() {
        return EE_23;
    }

    public void setEE_23(String EE_23) {
        this.EE_23 = EE_23;
    }

    public String getEE_24() {
        return EE_24;
    }

    public void setEE_24(String EE_24) {
        this.EE_24 = EE_24;
    }

    public String getEE_25() {
        return EE_25;
    }

    public void setEE_25(String EE_25) {
        this.EE_25 = EE_25;
    }

    public String getEE_26() {
        return EE_26;
    }

    public void setEE_26(String EE_26) {
        this.EE_26 = EE_26;
    }

    public String getEE_27() {
        return EE_27;
    }

    public void setEE_27(String EE_27) {
        this.EE_27 = EE_27;
    }

    public String getEE_28() {
        return EE_28;
    }

    public void setEE_28(String EE_28) {
        this.EE_28 = EE_28;
    }

    public String getEE_29() {
        return EE_29;
    }

    public void setEE_29(String EE_29) {
        this.EE_29 = EE_29;
    }

    public String getEE_30() {
        return EE_30;
    }

    public void setEE_30(String EE_30) {
        this.EE_30 = EE_30;
    }

    public String getEE_31() {
        return EE_31;
    }

    public void setEE_31(String EE_31) {
        this.EE_31 = EE_31;
    }

    public String getES_1() {
        return ES_1;
    }

    public void setES_1(String ES_1) {
        this.ES_1 = ES_1;
    }

    public String getES_2() {
        return ES_2;
    }

    public void setES_2(String ES_2) {
        this.ES_2 = ES_2;
    }

    public String getES_3() {
        return ES_3;
    }

    public void setES_3(String ES_3) {
        this.ES_3 = ES_3;
    }

    public String getES_4() {
        return ES_4;
    }

    public void setES_4(String ES_4) {
        this.ES_4 = ES_4;
    }

    public String getES_5() {
        return ES_5;
    }

    public void setES_5(String ES_5) {
        this.ES_5 = ES_5;
    }

    public String getES_6() {
        return ES_6;
    }

    public void setES_6(String ES_6) {
        this.ES_6 = ES_6;
    }

    public String getES_7() {
        return ES_7;
    }

    public void setES_7(String ES_7) {
        this.ES_7 = ES_7;
    }

    public String getES_8() {
        return ES_8;
    }

    public void setES_8(String ES_8) {
        this.ES_8 = ES_8;
    }

    public String getES_9() {
        return ES_9;
    }

    public void setES_9(String ES_9) {
        this.ES_9 = ES_9;
    }

    public String getES_10() {
        return ES_10;
    }

    public void setES_10(String ES_10) {
        this.ES_10 = ES_10;
    }

    public String getES_11() {
        return ES_11;
    }

    public void setES_11(String ES_11) {
        this.ES_11 = ES_11;
    }

    public String getES_12() {
        return ES_12;
    }

    public void setES_12(String ES_12) {
        this.ES_12 = ES_12;
    }

    public String getES_13() {
        return ES_13;
    }

    public void setES_13(String ES_13) {
        this.ES_13 = ES_13;
    }

    public String getES_14() {
        return ES_14;
    }

    public void setES_14(String ES_14) {
        this.ES_14 = ES_14;
    }

    public String getES_15() {
        return ES_15;
    }

    public void setES_15(String ES_15) {
        this.ES_15 = ES_15;
    }

    public String getES_16() {
        return ES_16;
    }

    public void setES_16(String ES_16) {
        this.ES_16 = ES_16;
    }

    public String getES_17() {
        return ES_17;
    }

    public void setES_17(String ES_17) {
        this.ES_17 = ES_17;
    }

    public String getES_18() {
        return ES_18;
    }

    public void setES_18(String ES_18) {
        this.ES_18 = ES_18;
    }

    public String getES_19() {
        return ES_19;
    }

    public void setES_19(String ES_19) {
        this.ES_19 = ES_19;
    }

    public String getES_20() {
        return ES_20;
    }

    public void setES_20(String ES_20) {
        this.ES_20 = ES_20;
    }

    public String getES_21() {
        return ES_21;
    }

    public void setES_21(String ES_21) {
        this.ES_21 = ES_21;
    }

    public String getES_22() {
        return ES_22;
    }

    public void setES_22(String ES_22) {
        this.ES_22 = ES_22;
    }

    public String getES_23() {
        return ES_23;
    }

    public void setES_23(String ES_23) {
        this.ES_23 = ES_23;
    }

    public String getES_24() {
        return ES_24;
    }

    public void setES_24(String ES_24) {
        this.ES_24 = ES_24;
    }

    public String getES_25() {
        return ES_25;
    }

    public void setES_25(String ES_25) {
        this.ES_25 = ES_25;
    }

    public String getES_26() {
        return ES_26;
    }

    public void setES_26(String ES_26) {
        this.ES_26 = ES_26;
    }

    public String getES_27() {
        return ES_27;
    }

    public void setES_27(String ES_27) {
        this.ES_27 = ES_27;
    }

    public String getES_28() {
        return ES_28;
    }

    public void setES_28(String ES_28) {
        this.ES_28 = ES_28;
    }

    public String getES_29() {
        return ES_29;
    }

    public void setES_29(String ES_29) {
        this.ES_29 = ES_29;
    }

    public String getES_30() {
        return ES_30;
    }

    public void setES_30(String ES_30) {
        this.ES_30 = ES_30;
    }

    public String getES_31() {
        return ES_31;
    }

    public void setES_31(String ES_31) {
        this.ES_31 = ES_31;
    }

    public String getE4_1() {
        return E4_1;
    }

    public void setE4_1(String e4_1) {
        E4_1 = e4_1;
    }

    public String getE4_2() {
        return E4_2;
    }

    public void setE4_2(String e4_2) {
        E4_2 = e4_2;
    }

    public String getE4_3() {
        return E4_3;
    }

    public void setE4_3(String e4_3) {
        E4_3 = e4_3;
    }

    public String getE4_4() {
        return E4_4;
    }

    public void setE4_4(String e4_4) {
        E4_4 = e4_4;
    }

    public String getE4_5() {
        return E4_5;
    }

    public void setE4_5(String e4_5) {
        E4_5 = e4_5;
    }

    public String getE4_6() {
        return E4_6;
    }

    public void setE4_6(String e4_6) {
        E4_6 = e4_6;
    }

    public String getE4_7() {
        return E4_7;
    }

    public void setE4_7(String e4_7) {
        E4_7 = e4_7;
    }

    public String getE4_8() {
        return E4_8;
    }

    public void setE4_8(String e4_8) {
        E4_8 = e4_8;
    }

    public String getE4_9() {
        return E4_9;
    }

    public void setE4_9(String e4_9) {
        E4_9 = e4_9;
    }

    public String getE4_10() {
        return E4_10;
    }

    public void setE4_10(String e4_10) {
        E4_10 = e4_10;
    }

    public String getE4_11() {
        return E4_11;
    }

    public void setE4_11(String e4_11) {
        E4_11 = e4_11;
    }

    public String getE4_12() {
        return E4_12;
    }

    public void setE4_12(String e4_12) {
        E4_12 = e4_12;
    }

    public String getE4_13() {
        return E4_13;
    }

    public void setE4_13(String e4_13) {
        E4_13 = e4_13;
    }

    public String getE4_14() {
        return E4_14;
    }

    public void setE4_14(String e4_14) {
        E4_14 = e4_14;
    }

    public String getE4_15() {
        return E4_15;
    }

    public void setE4_15(String e4_15) {
        E4_15 = e4_15;
    }

    public String getE4_16() {
        return E4_16;
    }

    public void setE4_16(String e4_16) {
        E4_16 = e4_16;
    }

    public String getE4_17() {
        return E4_17;
    }

    public void setE4_17(String e4_17) {
        E4_17 = e4_17;
    }

    public String getE4_18() {
        return E4_18;
    }

    public void setE4_18(String e4_18) {
        E4_18 = e4_18;
    }

    public String getE4_19() {
        return E4_19;
    }

    public void setE4_19(String e4_19) {
        E4_19 = e4_19;
    }

    public String getE4_20() {
        return E4_20;
    }

    public void setE4_20(String e4_20) {
        E4_20 = e4_20;
    }

    public String getE4_21() {
        return E4_21;
    }

    public void setE4_21(String e4_21) {
        E4_21 = e4_21;
    }

    public String getE4_22() {
        return E4_22;
    }

    public void setE4_22(String e4_22) {
        E4_22 = e4_22;
    }

    public String getE4_23() {
        return E4_23;
    }

    public void setE4_23(String e4_23) {
        E4_23 = e4_23;
    }

    public String getE4_24() {
        return E4_24;
    }

    public void setE4_24(String e4_24) {
        E4_24 = e4_24;
    }

    public String getE4_25() {
        return E4_25;
    }

    public void setE4_25(String e4_25) {
        E4_25 = e4_25;
    }

    public String getE4_26() {
        return E4_26;
    }

    public void setE4_26(String e4_26) {
        E4_26 = e4_26;
    }

    public String getE4_27() {
        return E4_27;
    }

    public void setE4_27(String e4_27) {
        E4_27 = e4_27;
    }

    public String getE4_28() {
        return E4_28;
    }

    public void setE4_28(String e4_28) {
        E4_28 = e4_28;
    }

    public String getE4_29() {
        return E4_29;
    }

    public void setE4_29(String e4_29) {
        E4_29 = e4_29;
    }

    public String getE4_30() {
        return E4_30;
    }

    public void setE4_30(String e4_30) {
        E4_30 = e4_30;
    }

    public String getE4_31() {
        return E4_31;
    }

    public void setE4_31(String e4_31) {
        E4_31 = e4_31;
    }

    public String getS4_1() {
        return S4_1;
    }

    public void setS4_1(String s4_1) {
        S4_1 = s4_1;
    }

    public String getS4_2() {
        return S4_2;
    }

    public void setS4_2(String s4_2) {
        S4_2 = s4_2;
    }

    public String getS4_3() {
        return S4_3;
    }

    public void setS4_3(String s4_3) {
        S4_3 = s4_3;
    }

    public String getS4_4() {
        return S4_4;
    }

    public void setS4_4(String s4_4) {
        S4_4 = s4_4;
    }

    public String getS4_5() {
        return S4_5;
    }

    public void setS4_5(String s4_5) {
        S4_5 = s4_5;
    }

    public String getS4_6() {
        return S4_6;
    }

    public void setS4_6(String s4_6) {
        S4_6 = s4_6;
    }

    public String getS4_7() {
        return S4_7;
    }

    public void setS4_7(String s4_7) {
        S4_7 = s4_7;
    }

    public String getS4_8() {
        return S4_8;
    }

    public void setS4_8(String s4_8) {
        S4_8 = s4_8;
    }

    public String getS4_9() {
        return S4_9;
    }

    public void setS4_9(String s4_9) {
        S4_9 = s4_9;
    }

    public String getS4_10() {
        return S4_10;
    }

    public void setS4_10(String s4_10) {
        S4_10 = s4_10;
    }

    public String getS4_11() {
        return S4_11;
    }

    public void setS4_11(String s4_11) {
        S4_11 = s4_11;
    }

    public String getS4_12() {
        return S4_12;
    }

    public void setS4_12(String s4_12) {
        S4_12 = s4_12;
    }

    public String getS4_13() {
        return S4_13;
    }

    public void setS4_13(String s4_13) {
        S4_13 = s4_13;
    }

    public String getS4_14() {
        return S4_14;
    }

    public void setS4_14(String s4_14) {
        S4_14 = s4_14;
    }

    public String getS4_15() {
        return S4_15;
    }

    public void setS4_15(String s4_15) {
        S4_15 = s4_15;
    }

    public String getS4_16() {
        return S4_16;
    }

    public void setS4_16(String s4_16) {
        S4_16 = s4_16;
    }

    public String getS4_17() {
        return S4_17;
    }

    public void setS4_17(String s4_17) {
        S4_17 = s4_17;
    }

    public String getS4_18() {
        return S4_18;
    }

    public void setS4_18(String s4_18) {
        S4_18 = s4_18;
    }

    public String getS4_19() {
        return S4_19;
    }

    public void setS4_19(String s4_19) {
        S4_19 = s4_19;
    }

    public String getS4_20() {
        return S4_20;
    }

    public void setS4_20(String s4_20) {
        S4_20 = s4_20;
    }

    public String getS4_21() {
        return S4_21;
    }

    public void setS4_21(String s4_21) {
        S4_21 = s4_21;
    }

    public String getS4_22() {
        return S4_22;
    }

    public void setS4_22(String s4_22) {
        S4_22 = s4_22;
    }

    public String getS4_23() {
        return S4_23;
    }

    public void setS4_23(String s4_23) {
        S4_23 = s4_23;
    }

    public String getS4_24() {
        return S4_24;
    }

    public void setS4_24(String s4_24) {
        S4_24 = s4_24;
    }

    public String getS4_25() {
        return S4_25;
    }

    public void setS4_25(String s4_25) {
        S4_25 = s4_25;
    }

    public String getS4_26() {
        return S4_26;
    }

    public void setS4_26(String s4_26) {
        S4_26 = s4_26;
    }

    public String getS4_27() {
        return S4_27;
    }

    public void setS4_27(String s4_27) {
        S4_27 = s4_27;
    }

    public String getS4_28() {
        return S4_28;
    }

    public void setS4_28(String s4_28) {
        S4_28 = s4_28;
    }

    public String getS4_29() {
        return S4_29;
    }

    public void setS4_29(String s4_29) {
        S4_29 = s4_29;
    }

    public String getS4_30() {
        return S4_30;
    }

    public void setS4_30(String s4_30) {
        S4_30 = s4_30;
    }

    public String getS4_31() {
        return S4_31;
    }

    public void setS4_31(String s4_31) {
        S4_31 = s4_31;
    }

    public String getE5_1() {
        return E5_1;
    }

    public void setE5_1(String e5_1) {
        E5_1 = e5_1;
    }

    public String getE5_2() {
        return E5_2;
    }

    public void setE5_2(String e5_2) {
        E5_2 = e5_2;
    }

    public String getE5_3() {
        return E5_3;
    }

    public void setE5_3(String e5_3) {
        E5_3 = e5_3;
    }

    public String getE5_4() {
        return E5_4;
    }

    public void setE5_4(String e5_4) {
        E5_4 = e5_4;
    }

    public String getE5_5() {
        return E5_5;
    }

    public void setE5_5(String e5_5) {
        E5_5 = e5_5;
    }

    public String getE5_6() {
        return E5_6;
    }

    public void setE5_6(String e5_6) {
        E5_6 = e5_6;
    }

    public String getE5_7() {
        return E5_7;
    }

    public void setE5_7(String e5_7) {
        E5_7 = e5_7;
    }

    public String getE5_8() {
        return E5_8;
    }

    public void setE5_8(String e5_8) {
        E5_8 = e5_8;
    }

    public String getE5_9() {
        return E5_9;
    }

    public void setE5_9(String e5_9) {
        E5_9 = e5_9;
    }

    public String getE5_10() {
        return E5_10;
    }

    public void setE5_10(String e5_10) {
        E5_10 = e5_10;
    }

    public String getE5_11() {
        return E5_11;
    }

    public void setE5_11(String e5_11) {
        E5_11 = e5_11;
    }

    public String getE5_12() {
        return E5_12;
    }

    public void setE5_12(String e5_12) {
        E5_12 = e5_12;
    }

    public String getE5_13() {
        return E5_13;
    }

    public void setE5_13(String e5_13) {
        E5_13 = e5_13;
    }

    public String getE5_14() {
        return E5_14;
    }

    public void setE5_14(String e5_14) {
        E5_14 = e5_14;
    }

    public String getE5_15() {
        return E5_15;
    }

    public void setE5_15(String e5_15) {
        E5_15 = e5_15;
    }

    public String getE5_16() {
        return E5_16;
    }

    public void setE5_16(String e5_16) {
        E5_16 = e5_16;
    }

    public String getE5_17() {
        return E5_17;
    }

    public void setE5_17(String e5_17) {
        E5_17 = e5_17;
    }

    public String getE5_18() {
        return E5_18;
    }

    public void setE5_18(String e5_18) {
        E5_18 = e5_18;
    }

    public String getE5_19() {
        return E5_19;
    }

    public void setE5_19(String e5_19) {
        E5_19 = e5_19;
    }

    public String getE5_20() {
        return E5_20;
    }

    public void setE5_20(String e5_20) {
        E5_20 = e5_20;
    }

    public String getE5_21() {
        return E5_21;
    }

    public void setE5_21(String e5_21) {
        E5_21 = e5_21;
    }

    public String getE5_22() {
        return E5_22;
    }

    public void setE5_22(String e5_22) {
        E5_22 = e5_22;
    }

    public String getE5_23() {
        return E5_23;
    }

    public void setE5_23(String e5_23) {
        E5_23 = e5_23;
    }

    public String getE5_24() {
        return E5_24;
    }

    public void setE5_24(String e5_24) {
        E5_24 = e5_24;
    }

    public String getE5_25() {
        return E5_25;
    }

    public void setE5_25(String e5_25) {
        E5_25 = e5_25;
    }

    public String getE5_26() {
        return E5_26;
    }

    public void setE5_26(String e5_26) {
        E5_26 = e5_26;
    }

    public String getE5_27() {
        return E5_27;
    }

    public void setE5_27(String e5_27) {
        E5_27 = e5_27;
    }

    public String getE5_28() {
        return E5_28;
    }

    public void setE5_28(String e5_28) {
        E5_28 = e5_28;
    }

    public String getE5_29() {
        return E5_29;
    }

    public void setE5_29(String e5_29) {
        E5_29 = e5_29;
    }

    public String getE5_30() {
        return E5_30;
    }

    public void setE5_30(String e5_30) {
        E5_30 = e5_30;
    }

    public String getE5_31() {
        return E5_31;
    }

    public void setE5_31(String e5_31) {
        E5_31 = e5_31;
    }

    public String getS5_1() {
        return S5_1;
    }

    public void setS5_1(String s5_1) {
        S5_1 = s5_1;
    }

    public String getS5_2() {
        return S5_2;
    }

    public void setS5_2(String s5_2) {
        S5_2 = s5_2;
    }

    public String getS5_3() {
        return S5_3;
    }

    public void setS5_3(String s5_3) {
        S5_3 = s5_3;
    }

    public String getS5_4() {
        return S5_4;
    }

    public void setS5_4(String s5_4) {
        S5_4 = s5_4;
    }

    public String getS5_5() {
        return S5_5;
    }

    public void setS5_5(String s5_5) {
        S5_5 = s5_5;
    }

    public String getS5_6() {
        return S5_6;
    }

    public void setS5_6(String s5_6) {
        S5_6 = s5_6;
    }

    public String getS5_7() {
        return S5_7;
    }

    public void setS5_7(String s5_7) {
        S5_7 = s5_7;
    }

    public String getS5_8() {
        return S5_8;
    }

    public void setS5_8(String s5_8) {
        S5_8 = s5_8;
    }

    public String getS5_9() {
        return S5_9;
    }

    public void setS5_9(String s5_9) {
        S5_9 = s5_9;
    }

    public String getS5_10() {
        return S5_10;
    }

    public void setS5_10(String s5_10) {
        S5_10 = s5_10;
    }

    public String getS5_11() {
        return S5_11;
    }

    public void setS5_11(String s5_11) {
        S5_11 = s5_11;
    }

    public String getS5_12() {
        return S5_12;
    }

    public void setS5_12(String s5_12) {
        S5_12 = s5_12;
    }

    public String getS5_13() {
        return S5_13;
    }

    public void setS5_13(String s5_13) {
        S5_13 = s5_13;
    }

    public String getS5_14() {
        return S5_14;
    }

    public void setS5_14(String s5_14) {
        S5_14 = s5_14;
    }

    public String getS5_15() {
        return S5_15;
    }

    public void setS5_15(String s5_15) {
        S5_15 = s5_15;
    }

    public String getS5_16() {
        return S5_16;
    }

    public void setS5_16(String s5_16) {
        S5_16 = s5_16;
    }

    public String getS5_17() {
        return S5_17;
    }

    public void setS5_17(String s5_17) {
        S5_17 = s5_17;
    }

    public String getS5_18() {
        return S5_18;
    }

    public void setS5_18(String s5_18) {
        S5_18 = s5_18;
    }

    public String getS5_19() {
        return S5_19;
    }

    public void setS5_19(String s5_19) {
        S5_19 = s5_19;
    }

    public String getS5_20() {
        return S5_20;
    }

    public void setS5_20(String s5_20) {
        S5_20 = s5_20;
    }

    public String getS5_21() {
        return S5_21;
    }

    public void setS5_21(String s5_21) {
        S5_21 = s5_21;
    }

    public String getS5_22() {
        return S5_22;
    }

    public void setS5_22(String s5_22) {
        S5_22 = s5_22;
    }

    public String getS5_23() {
        return S5_23;
    }

    public void setS5_23(String s5_23) {
        S5_23 = s5_23;
    }

    public String getS5_24() {
        return S5_24;
    }

    public void setS5_24(String s5_24) {
        S5_24 = s5_24;
    }

    public String getS5_25() {
        return S5_25;
    }

    public void setS5_25(String s5_25) {
        S5_25 = s5_25;
    }

    public String getS5_26() {
        return S5_26;
    }

    public void setS5_26(String s5_26) {
        S5_26 = s5_26;
    }

    public String getS5_27() {
        return S5_27;
    }

    public void setS5_27(String s5_27) {
        S5_27 = s5_27;
    }

    public String getS5_28() {
        return S5_28;
    }

    public void setS5_28(String s5_28) {
        S5_28 = s5_28;
    }

    public String getS5_29() {
        return S5_29;
    }

    public void setS5_29(String s5_29) {
        S5_29 = s5_29;
    }

    public String getS5_30() {
        return S5_30;
    }

    public void setS5_30(String s5_30) {
        S5_30 = s5_30;
    }

    public String getS5_31() {
        return S5_31;
    }

    public void setS5_31(String s5_31) {
        S5_31 = s5_31;
    }

    public String getColaborador() {
        return Colaborador;
    }

    public void setColaborador(String colaborador) {
        Colaborador = colaborador;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDocID() {
        return DocID;
    }

    public void setDocID(String docID) {
        DocID = docID;
    }

    public String getControlePonto() {
        return ControlePonto;
    }

    public void setControlePonto(String controlePonto) {
        ControlePonto = controlePonto;
    }

    public String getFlagNotifSemPonto() {
        return flagNotifSemPonto;
    }

    public void setFlagNotifSemPonto(String flagNotifSemPonto) {
        this.flagNotifSemPonto = flagNotifSemPonto;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getQUINZENA() {
        return QUINZENA;
    }

    public void setQUINZENA(String quinzena) {
        QUINZENA = quinzena;
    }

    public String getLiberaEmissao() {
        return LiberaEmissao;
    }

    public void setLiberaEmissao(String liberaEmissao) {
        LiberaEmissao = liberaEmissao;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getObs_1() {
        return Obs_1;
    }

    public void setObs_1(String obs_1) {
        Obs_1 = obs_1;
    }

    public String getObs_2() {
        return Obs_2;
    }

    public void setObs_2(String obs_2) {
        Obs_2 = obs_2;
    }

    public String getObs_3() {
        return Obs_3;
    }

    public void setObs_3(String obs_3) {
        Obs_3 = obs_3;
    }

    public String getObs_4() {
        return Obs_4;
    }

    public void setObs_4(String obs_4) {
        Obs_4 = obs_4;
    }

    public String getObs_5() {
        return Obs_5;
    }

    public void setObs_5(String obs_5) {
        Obs_5 = obs_5;
    }

    public String getObs_6() {
        return Obs_6;
    }

    public void setObs_6(String obs_6) {
        Obs_6 = obs_6;
    }

    public String getObs_7() {
        return Obs_7;
    }

    public void setObs_7(String obs_7) {
        Obs_7 = obs_7;
    }

    public String getObs_8() {
        return Obs_8;
    }

    public void setObs_8(String obs_8) {
        Obs_8 = obs_8;
    }

    public String getObs_9() {
        return Obs_9;
    }

    public void setObs_9(String obs_9) {
        Obs_9 = obs_9;
    }

    public String getObs_10() {
        return Obs_10;
    }

    public void setObs_10(String obs_10) {
        Obs_10 = obs_10;
    }

    public String getObs_11() {
        return Obs_11;
    }

    public void setObs_11(String obs_11) {
        Obs_11 = obs_11;
    }

    public String getObs_12() {
        return Obs_12;
    }

    public void setObs_12(String obs_12) {
        Obs_12 = obs_12;
    }

    public String getObs_13() {
        return Obs_13;
    }

    public void setObs_13(String obs_13) {
        Obs_13 = obs_13;
    }

    public String getObs_14() {
        return Obs_14;
    }

    public void setObs_14(String obs_14) {
        Obs_14 = obs_14;
    }

    public String getObs_15() {
        return Obs_15;
    }

    public void setObs_15(String obs_15) {
        Obs_15 = obs_15;
    }

    public String getObs_16() {
        return Obs_16;
    }

    public void setObs_16(String obs_16) {
        Obs_16 = obs_16;
    }

    public String getObs_17() {
        return Obs_17;
    }

    public void setObs_17(String obs_17) {
        Obs_17 = obs_17;
    }

    public String getObs_18() {
        return Obs_18;
    }

    public void setObs_18(String obs_18) {
        Obs_18 = obs_18;
    }

    public String getObs_19() {
        return Obs_19;
    }

    public void setObs_19(String obs_19) {
        Obs_19 = obs_19;
    }

    public String getObs_20() {
        return Obs_20;
    }

    public void setObs_20(String obs_20) {
        Obs_20 = obs_20;
    }

    public String getObs_21() {
        return Obs_21;
    }

    public void setObs_21(String obs_21) {
        Obs_21 = obs_21;
    }

    public String getObs_22() {
        return Obs_22;
    }

    public void setObs_22(String obs_22) {
        Obs_22 = obs_22;
    }

    public String getObs_23() {
        return Obs_23;
    }

    public void setObs_23(String obs_23) {
        Obs_23 = obs_23;
    }

    public String getObs_24() {
        return Obs_24;
    }

    public void setObs_24(String obs_24) {
        Obs_24 = obs_24;
    }

    public String getObs_25() {
        return Obs_25;
    }

    public void setObs_25(String obs_25) {
        Obs_25 = obs_25;
    }

    public String getObs_26() {
        return Obs_26;
    }

    public void setObs_26(String obs_26) {
        Obs_26 = obs_26;
    }

    public String getObs_27() {
        return Obs_27;
    }

    public void setObs_27(String obs_27) {
        Obs_27 = obs_27;
    }

    public String getObs_28() {
        return Obs_28;
    }

    public void setObs_28(String obs_28) {
        Obs_28 = obs_28;
    }

    public String getObs_29() {
        return Obs_29;
    }

    public void setObs_29(String obs_29) {
        Obs_29 = obs_29;
    }

    public String getObs_30() {
        return Obs_30;
    }

    public void setObs_30(String obs_30) {
        Obs_30 = obs_30;
    }

    public String getObs_31() {
        return Obs_31;
    }

    public void setObs_31(String obs_31) {
        Obs_31 = obs_31;
    }


    public String getTotal_1() {
        Total_1.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_1 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_1(String total_1) {
        Total_1 = total_1;
    }

    public String getTotal_2() {
        Total_2.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_2 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_2(String total_2) {
        Total_2 = total_2;
    }

    public String getTotal_3() {
        Total_3.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_3 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_3(String total_3) {
        Total_3 = total_3;
    }

    public String getTotal_4() {
        Total_4.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_4 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_4(String total_4) {
        Total_4 = total_4;
    }

    public String getTotal_5() {
        Total_5.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_5 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_5(String total_5) {
        Total_5 = total_5;
    }

    public String getTotal_6() {
        Total_6.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_6 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_6(String total_6) {
        Total_6 = total_6;
    }

    public String getTotal_7() {
        Total_7.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_7 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_7(String total_7) {
        Total_7 = total_7;
    }

    public String getTotal_8() {
        Total_8.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_8 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_8(String total_8) {
        Total_8 = total_8;
    }

    public String getTotal_9() {
        Total_9.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_9 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_9(String total_9) {
        Total_9 = total_9;
    }

    public String getTotal_10() {
        Total_10.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_10 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_10(String total_10) {
        Total_10 = total_10;
    }

    public String getTotal_11() {
        Total_11.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_11 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_11(String total_11) {
        Total_11 = total_11;
    }

    public String getTotal_12() {
        Total_12.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_12 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_12(String total_12) {
        Total_12 = total_12;
    }

    public String getTotal_13() {
        Total_13.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_13 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_13(String total_13) {
        Total_13 = total_13;
    }

    public String getTotal_14() {
        Total_14.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_14 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_14(String total_14) {
        Total_14 = total_14;
    }

    public String getTotal_15() {
        Total_15.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_15 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_15(String total_15) {
        Total_15 = total_15;
    }

    public String getTotal_16() {
        Total_16.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_26 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_16(String total_16) {
        Total_16 = total_16;
    }

    public String getTotal_17() {
        Total_17.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_17 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_17(String total_17) {
        Total_17 = total_17;
    }

    public String getTotal_18() {
        Total_18.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_18 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_18(String total_18) {
        Total_18 = total_18;
    }

    public String getTotal_19() {
        Total_19.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_19 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_19(String total_19) {
        Total_19 = total_19;
    }

    public String getTotal_20() {
        Total_20.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_20 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_20(String total_20) {
        Total_20 = total_20;
    }

    public String getTotal_21() {
        Total_21.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_21 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_21(String total_21) {
        Total_21 = total_21;
    }

    public String getTotal_22() {
        Total_22.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_22 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_22(String total_22) {
        Total_22 = total_22;
    }

    public String getTotal_23() {
        Total_23.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_23 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_23(String total_23) {
        Total_23 = total_23;
    }

    public String getTotal_24() {
        Total_24.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_24 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_24(String total_24) {
        Total_24 = total_24;
    }

    public String getTotal_25() {
        Total_25.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_25 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_25(String total_25) {
        Total_25 = total_25;
    }

    public String getTotal_26() {
        Total_26.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_26 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_26(String total_26) {
        Total_26 = total_26;
    }

    public String getTotal_27() {
        Total_27.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_27 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_27(String total_27) {
        Total_27 = total_27;
    }

    public String getTotal_28() {
        Total_28.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_28 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_28(String total_28) {
        Total_28 = total_28;
    }

    public String getTotal_29() {
        Total_29.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_29 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_29(String total_29) {
        Total_29 = total_29;
    }

    public String getTotal_30() {
        Total_30.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_30 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_30(String total_30) {
        Total_30 = total_30;
    }

    public String getTotal_31() {
        Total_31.replaceAll( "," , "." );
        Double valorDouble = Double.parseDouble( Total_31 );
        return String.format("%.2f", valorDouble);
    }

    public void setTotal_31(String total_31) {
        Total_31 = total_31;
    }

    public String getTotalHrsUteisMes() {
        return TotalHrsUteisMes;
    }

    public void setTotalHrsUteisMes(String totalHrsUteisMes) {
        TotalHrsUteisMes = totalHrsUteisMes;
    }

    public String getTotalHrTrab() {
        return TotalHrTrab;
    }

    public void setTotalHrTrab(String totalHrTrab) {
        TotalHrTrab = totalHrTrab;
    }
}