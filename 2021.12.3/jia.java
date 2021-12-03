package Yuyin;

public class jia {
public static void main(String[] args) {
	ActiveXComponent sap=new ActiveXComponent("Sapi.SpVOICE");
	try {
		sap.setProperty("Volume",new Variant(100));
		sap.setProperty("Rate", new Variant(-2));
		Dispatch sapo=sap.getObject();
		Dispatch.call(sapo,"Speak",new Variant("ÄãºÃ"));
		sap.safeRelease();
	}catch(Exception e)
	{e.printStackTrace();
	}finally{
		sap.safeRelease();
	}
}
}
