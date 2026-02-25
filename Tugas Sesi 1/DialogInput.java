import javax.swing.JOptionPane;

public class DialogInput {
    public static void main(String[] args) {
         
        String pelajaran = JOptionPane.showInputDialog(
            null, 
            "Anda sedang belajar apa?", 
            "Input", 
            JOptionPane.QUESTION_MESSAGE
        );
        
        
        if (pelajaran != null) {
            
            String pesan = "Belajar " + pelajaran + " sangat mudah";
            JOptionPane.showMessageDialog(
                null, 
                pesan, 
                "Message", 
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}