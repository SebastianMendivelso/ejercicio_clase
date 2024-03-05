import javax.swing.JOptionPane;
public class ejercicio {
    public static void main(String[] args) {
        int[] numeros=new int[200 ];
            int suma=0;
            double media;   
            /*se recorrera el ejercicio*/
            for(int i=0;i<numeros.length;i++){
                numeros[i]=i+1;
                suma+=numeros[i];
            }
            JOptionPane.showMessageDialog(null, "La suma es "+suma);
            media=(double)suma/numeros.length;
            JOptionPane.showMessageDialog(null,"La media es "+media);  
        }
}