package ListExtra;

import javax.swing.JOptionPane;

public class OptionPane{
	public static void main(String[] args) {
		String user;
		int pass, contador = 3;
		boolean valido = false;
		
		while((contador>0)&&(!valido)) {
			user = JOptionPane.showInputDialog(null, "Digite o usuário",
					"LOGIN", JOptionPane.QUESTION_MESSAGE);
			pass = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha",
					"LOGIN", JOptionPane.QUESTION_MESSAGE));
			contador--;
			if (user.equals("boi")&&(pass==1213)) {
				JOptionPane.showMessageDialog(null, "Login efetuado com sucesso", 
						"LOGIN", JOptionPane.INFORMATION_MESSAGE);
				valido = true;
			}else {
				JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos", 
						"LOGIN", JOptionPane.INFORMATION_MESSAGE);
				if (contador==2) {
					JOptionPane.showMessageDialog(null, "Restam " + contador + " tentativas!", 
							"LOGIN", JOptionPane.WARNING_MESSAGE);
				}else if(contador==1) {
					JOptionPane.showMessageDialog(null, "Resta " + contador + " tentativa!", 
							"LOGIN", JOptionPane.WARNING_MESSAGE);
				}else if (contador==0) {
					JOptionPane.showMessageDialog(null, "LOGIN BLOQUEADO", 
							"LOGIN", JOptionPane.WARNING_MESSAGE);
				}	
			}
		}		
	}
}