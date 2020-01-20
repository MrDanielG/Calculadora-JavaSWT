package calculadora.gui;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.ui.forms.widgets.FormText;
import calculadora.op.*;
import org.eclipse.wb.swt.SWTResourceManager;

public class MainWindow {

	protected Shell shell;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	
	float numA = 0;
	float numB = 0;
	String op;
	private Text value2;
	private Text value1;
	OpSimples opS = new OpSimples();
	OpComplejas opC = new OpComplejas();

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(289, 458);
		shell.setText("Calculadora Practica 02");
		
		Button btnMultiplicar = new Button(shell, SWT.NONE);
		btnMultiplicar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value1.setText(value2.getText());
				value2.setText("");
				op = "multiplicacion";
			}
		});
		btnMultiplicar.setBounds(202, 307, 59, 41);
		formToolkit.adapt(btnMultiplicar, true, true);
		btnMultiplicar.setText("*");
		
		Button btnSumar = formToolkit.createButton(shell, "+", SWT.NONE);
		btnSumar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value1.setText(value2.getText());
				value2.setText("");
				op = "suma";
			}
		});
		btnSumar.setBounds(202, 260, 59, 41);
		
		Button btnRestar = new Button(shell, SWT.NONE);
		btnRestar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value1.setText(value2.getText());
				value2.setText("");
				op = "resta";
			}
		});
		btnRestar.setBounds(202, 213, 59, 41);
		formToolkit.adapt(btnRestar, true, true);
		btnRestar.setText("-");
		
		Button btnDivision = new Button(shell, SWT.NONE);
		btnDivision.setBounds(202, 119, 59, 41);
		formToolkit.adapt(btnDivision, true, true);
		btnDivision.setText("/");
		
		Button button = formToolkit.createButton(shell, "0", SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value2.setText(value2.getText()+0);
			}
		});
		button.setBounds(10, 354, 124, 41);
		
		Button button_1 = formToolkit.createButton(shell, "1", SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value2.setText(value2.getText()+1);
			}
		});
		button_1.setBounds(10, 307, 59, 41);
		
		Button button_2 = formToolkit.createButton(shell, "2", SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value2.setText(value2.getText()+2);
			}
		});
		button_2.setBounds(75, 307, 59, 41);
		
		Button button_3 = formToolkit.createButton(shell, "3", SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value2.setText(value2.getText()+3);
			}
		});
		button_3.setBounds(137, 307, 59, 41);
		
		Button button_4 = formToolkit.createButton(shell, ".", SWT.NONE);
		button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value2.setText(value2.getText()+".");
			}
		});
		button_4.setBounds(140, 354, 56, 41);
		
		Button button_5 = formToolkit.createButton(shell, "4", SWT.NONE);
		button_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value2.setText(value2.getText()+4);
			}
		});
		button_5.setBounds(10, 260, 59, 41);
		
		Button button_6 = formToolkit.createButton(shell, "5", SWT.NONE);
		button_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value2.setText(value2.getText()+5);
			}
		});
		button_6.setBounds(75, 260, 59, 41);
		
		Button button_7 = formToolkit.createButton(shell, "6", SWT.NONE);
		button_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value2.setText(value2.getText()+6);
			}
		});
		button_7.setBounds(137, 260, 59, 41);
		
		Button button_8 = formToolkit.createButton(shell, "7", SWT.NONE);
		button_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value2.setText(value2.getText()+7);
			}
		});
		button_8.setBounds(10, 213, 59, 41);
		
		Button button_9 = formToolkit.createButton(shell, "8", SWT.NONE);
		button_9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value2.setText(value2.getText()+8);
			}
		});
		button_9.setBounds(75, 213, 59, 41);
		
		Button button_10 = formToolkit.createButton(shell, "9", SWT.NONE);
		button_10.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value2.setText(value2.getText()+9);
			}
		});
		button_10.setBounds(137, 213, 59, 41);
		
		Button btnPotencia = formToolkit.createButton(shell, "^", SWT.NONE);
		btnPotencia.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value1.setText(value2.getText());
				value2.setText("");
				op = "potencia";
			}
		});
		btnPotencia.setBounds(10, 166, 59, 41);
		
		Button btnRaizCuadrada = formToolkit.createButton(shell, "r2", SWT.NONE);
		btnRaizCuadrada.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value1.setText(value2.getText());
				value2.setText("");
				op = "raizCuadrada";
			}
		});
		btnRaizCuadrada.setBounds(137, 166, 59, 41);
		
		Button button_12 = formToolkit.createButton(shell, "%", SWT.NONE);
		button_12.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value1.setText(value2.getText());
				value2.setText("");
				op = "modulo";
			}
		});
		button_12.setBounds(202, 166, 59, 41);
		
		Button btnCuadrado = formToolkit.createButton(shell, "^2", SWT.NONE);
		btnCuadrado.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value1.setText(value2.getText());
				value2.setText("");
				op = "alCuadrado";
			}
		});
		btnCuadrado.setBounds(75, 166, 59, 41);
		
		Button btnBorrar = new Button(shell, SWT.NONE);
		btnBorrar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value1.setText("");
				value2.setText("");
			}
		});
		btnBorrar.setBounds(10, 119, 186, 41);
		formToolkit.adapt(btnBorrar, true, true);
		btnBorrar.setText("Borrar");
		
		Button btnResultado = new Button(shell, SWT.NONE);
		btnResultado.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(value1.getText() == "" | value2.getText() == "") {
					numA = Float.parseFloat(value1.getText());
				} else {
					numA = Float.parseFloat(value1.getText());
					numB = Float.parseFloat(value2.getText());
				}	
				
				if(op == "suma") {
					String resultado = opS.suma(numA, numB);
					value2.setText(resultado);
					value1.setText(resultado);
				} else if(op == "resta") {
					String resultado = opS.resta(numA, numB);
					value2.setText(resultado);
					value1.setText(resultado);
				} else if(op == "multiplicacion") {
					String resultado = opS.multi(numA, numB);
					value2.setText(resultado);
					value1.setText(resultado);
				} else if(op == "division") {
					String resultado = opS.division(numA, numB);
					value2.setText(resultado);
					value1.setText(resultado);
				} else if(op == "potencia") {
					String resultado = opC.potencia(numA, numB);
					value2.setText(resultado);
					value1.setText(resultado);
				} else if(op == "alCuadrado") {
					String resultado = opC.potenciaCuadrada(numA);
					value2.setText(resultado);
					value1.setText(resultado);
				} else if(op == "modulo") {
					String resultado = opC.modulo(numA, numB);
					value2.setText(resultado);
					value1.setText(resultado);
				} else if(op == "raizCuadrada") {
					String resultado = opC.raiz(numA);
					value2.setText(resultado);
					value1.setText(resultado);
				} 
			}
		});
		btnResultado.setBounds(202, 354, 59, 41);
		formToolkit.adapt(btnResultado, true, true);
		btnResultado.setText("=");
		
		value2 = new Text(shell, SWT.READ_ONLY);
		value2.setFont(SWTResourceManager.getFont("Consolas", 20, SWT.NORMAL));
		value2.setBounds(10, 65, 251, 35);
		formToolkit.adapt(value2, true, true);
		
		value1 = new Text(shell, SWT.READ_ONLY | SWT.RIGHT);
		value1.setFont(SWTResourceManager.getFont("Consolas", 10, SWT.NORMAL));
		value1.setBounds(10, 29, 251, 41);
		formToolkit.adapt(value1, true, true);

	}
}
