import java.util.ArrayList;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class LessListModel implements ListModel<String> {
	private ArrayList<String> data;

	public LessListModel() {
		data = new ArrayList<String>();
	}
	@Override
	public void addListDataListener(ListDataListener arg0) {			
	}	
	@Override
	public void removeListDataListener(ListDataListener arg0) {		
	}
	@Override
	public String getElementAt(int index) {		
		return data.get(index);
	}
	@Override
	public int getSize() {		
		return data.size();
	}
	public void addElements (String s){
		data.add(s);
	}	
	public void removeElements (int index){
		data.remove(index);
	}	
	public void removeElements (String obj){
		data.remove(obj);
	}
}
