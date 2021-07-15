package Q7testfail;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe implements Runnable{
	
	List<String> nameFail = new CopyOnWriteArrayList<String>();
	public FailSafe() {

		nameFail.add("surya");
		nameFail.add("vinith");
		nameFail.add("vinoth");



		Thread t1=new Thread(this);
		Thread t2=new Thread(this);
		t1.setName("Display");
		t2.setName("Insert");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("Display"))
		{
			Iterator<String>itr = nameFail.iterator(); //Fail-fast iterator
			while(itr.hasNext()) {
				System.out.println(itr.next());
				
			}
		}
		if(currentThread.getName().equals("Insert"))
		{

			nameFail.add("John");
		}
	}

}
