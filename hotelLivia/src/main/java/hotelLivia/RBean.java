package hotelLivia;

import java.io.Serializable;

public class RBean implements Serializable
{
	private Long rBill;

	public RBean()
	{
		
	}
	public Long getrBill() {
		return rBill;
	}

	public void setrBill(Long rBill) {
		this.rBill = rBill;
	}
	
}
