package by.cmd;

import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class PetsonModal implements TableModel {
	private ArrayList<TableModelListener> listener;
	
	public PetsonModal() {
		listener = new ArrayList<TableModelListener>();
	}	

	@Override
	public void addTableModelListener(TableModelListener l) {
		listener.add(l);		
	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		
		return String.class;
	}

	@Override
	public int getColumnCount() {		
		return 2;
	}

	@Override
	public String getColumnName(int index) {
		String return_String = "";
		switch (index) {
		case 0:
			return_String = "Name";
			break;
		case 1:	
			return_String = "SurName";
			break;		
		}
		return return_String;
	}

	@Override
	public int getRowCount() {		
		return MainL.persons.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		Object return_object = null;
		switch (col) {
		case 0:
			return_object = MainL.persons.get(row).getName();
			break;
		case 1:
			return_object = MainL.persons.get(row).getSername();
			break;			
		}
		return return_object;
	}

	@Override
	public boolean isCellEditable(int row, int col) {
	
		return true;
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		listener.remove(l);
		
	}

	@Override
	public void setValueAt(Object value, int row, int col) {
		switch (col) {
		case 0:
			MainL.persons.get(row).setName((String) value);
			break;
		case 1:
			MainL.persons.get(row).setSername((String) value);
			break;	

		
		}
		
		
		
	}

}
