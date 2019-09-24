import javax.swing.JFrame;

public class ej1Ventana extends JFrame {
	private static final long serialVersionUID = 1L;
	
	
	public ej1Ventana() {
		System.out.println();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Cerrar la ventana");
		this.setSize(400,200);
		
		
		
		
	}
	
	public static void main(String[] args) {
		ej1Ventana ej1Ventana = new ej1Ventana();
		ej1Ventana.setVisible(true);
	}
}
