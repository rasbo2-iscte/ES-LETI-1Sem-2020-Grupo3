import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class GUI extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GUI(Composite parent, int style) {
		super(parent, style);
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(28, 170, 90, 30);
		btnNewButton.setText("New Button");
		
		Button btnVerifica = new Button(this, SWT.CHECK);
		btnVerifica.setBounds(39, 128, 111, 20);
		btnVerifica.setText("Verifica");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
