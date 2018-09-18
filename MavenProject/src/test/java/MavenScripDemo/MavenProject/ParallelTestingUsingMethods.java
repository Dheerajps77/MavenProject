package MavenScripDemo.MavenProject;

import org.testng.annotations.Test;

public class ParallelTestingUsingMethods {
	
	
	@Test(priority=0)
	public void SnippingToolTesting()
	{
		System.out.println("The current thread name of SnippingToolTesting is "+ Thread.currentThread().getName());
		System.out.println("The current thread ID of SnippingToolTesting is "+ Thread.currentThread().getId());
		System.out.println("The current thread priority of SnippingToolTesting is "+ Thread.currentThread().getPriority());
		System.out.println("The current thread State of SnippingToolTesting is "+ Thread.currentThread().getState());
		Thread.currentThread();
		System.out.println("The current thread active count of SnippingToolTesting is "+ Thread.activeCount());
		System.out.println("================================================================================");
		
	}

	
	@Test(priority=1)
	public void MsWordTesting()
	{
		System.out.println("The current thread name of MsWordTesting is "+ Thread.currentThread().getName());
		System.out.println("The current thread ID of MsWordTesting is "+ Thread.currentThread().getId());
		System.out.println("The current thread priority of MsWordTesting is "+ Thread.currentThread().getPriority());
		System.out.println("The current thread State of MsWordTesting is "+ Thread.currentThread().getState());
		Thread.currentThread();
		System.out.println("The current thread active count of MsWordTesting is "+ Thread.activeCount());
		System.out.println("================================================================================");
	}

	
	@Test(priority=2)
	public void MSExcelTesting()
	{
		System.out.println("The current thread name of MSExcelTesting is "+ Thread.currentThread().getName());
		System.out.println("The current thread ID of MSExcelTesting is "+ Thread.currentThread().getId());
		System.out.println("The current thread priority of MSExcelTesting is "+ Thread.currentThread().getPriority());
		System.out.println("The current thread State of MSExcelTesting is "+ Thread.currentThread().getState());
		Thread.currentThread();
		System.out.println("The current thread active count of MSExcelTesting is "+ Thread.activeCount());
		System.out.println("================================================================================");
	}

}
