/**
 * @author Hanwen Zhang
 * @version 9/24/2019
 **/
public class StoreManager {

    public static void main(String[] args) {
        System.out.println("Hello class!");
        SQLiteDataAdapter adapter = new SQLiteDataAdapter();
        adapter.connect();
        
        AddProductView apView = new AddProductView();
        AddCustomerView cView = new AddCustomerView();
        AddProductController apCtr = new AddProductController(apView, adapter);
        AddCustomerController cCtr = new AddCustomerController(cView, adapter);
        
        apView.setVisible(true);
        cView.setVisible(true);
    }
}
