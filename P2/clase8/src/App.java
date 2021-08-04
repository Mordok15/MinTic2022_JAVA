import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        ArrayList<Converter> documentos = new ArrayList();

        Converter objDoc1 = new ASCIIConverter("1", "Lectura");
        Converter objDoc2 = new PostScriptConverter("1", "Lectura");
        Converter objDoc3 = new PDFConverter("1", "Lectura");
        documentos.add(objDoc1);
        documentos.add(objDoc2);
        documentos.add(objDoc3);
        
        System.out.println(documentos.size());
        
        for(int i = 0; i < documentos.size(); i++){
            System.out.println(documentos.get(i));
        }
        

        //-----------------------------------------------

        Converter[] convertidor = new Converter[3];
        
        convertidor[0] = new ASCIIConverter("1", "Lectura");
        convertidor[1] = new PostScriptConverter("1", "Lectura");
        convertidor[2] = new PDFConverter("1", "Lectura");
        
    }
}
