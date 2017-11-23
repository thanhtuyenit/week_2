package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	Ex1.pk1_1.CircleTest.class,
	Ex1.pk1_2.CircleTest.class,
	Ex1.pk1_3.RectangleTest.class,
	Ex1.pk1_4.EmployeeTest.class,
	Ex1.pk1_5.InvoiceItemTest.class,
	Ex1.pk1_6.AccountTest.class,
	Ex1.pk1_7.DateTest.class,
	Ex1.pk1_8.TimeTest.class,
	Ex2.pk2_1.AuthorTest.class,
	Ex2.pk2_1.BookTest.class,
	Ex2.pk2_2.BookTest.class,
	Ex2.pk2_7.InvoiceTest.class
})

public class JunitTestSuite {   
}  
