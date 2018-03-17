package xyz.marsj.hibernate.cascade;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class CascadeTest {
	
	private SalaBillDao dao=new SalaBillDaoImpl();
@Before
public void testSave(){
	SalaBill sb=new SalaBill();
	sb.setSn("phone");
	sb.setInputTime(new Date());
	SalaBillItem sbi1=new SalaBillItem();
	SalaBillItem sbi2=new SalaBillItem();
	SalaBillItem sbi3=new SalaBillItem();
	sbi1.setProduct("iphone");
	sbi2.setProduct("huawei");
	sbi3.setProduct("xiaomi");
	sbi1.setBill(sb);
	sbi2.setBill(sb);
	sbi3.setBill(sb);
	sb.getSbi().add(sbi1);
	sb.getSbi().add(sbi2);
	sb.getSbi().add(sbi3);
	dao.save(sb);
}
@Test
public void testDelete(){
	dao.delete(1L);
}
@Test
public void testUpdate(){
	SalaBill bill = dao.get(1L);
	//增加一个BillItem
	SalaBillItem sbi4=new SalaBillItem();
	sbi4.setBill(bill);
	sbi4.setProduct("insert");
	bill.getSbi().add(sbi4);
	//更新一个BillItem
	SalaBillItem next = bill.getSbi().iterator().next();
	next.setProduct("update");
	dao.update(bill);
}


@Test
public void testUpdate2(){
	SalaBill bill = dao.get(1L);
	SalaBillItem next = bill.getSbi().iterator().next();
	bill.getSbi().remove(next);
	dao.update(bill);
}

}
