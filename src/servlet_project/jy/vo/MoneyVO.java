package servlet_project.jy.vo;

import java.sql.Timestamp;

/*이름      널?       유형          
------- -------- ----------- 
CUSTNO  NOT NULL NUMBER(6)   
SALENOL NOT NULL NUMBER(8)   
PCOST            NUMBER(8)   
AMOUNT           NUMBER(4)   
PRICE            NUMBER(8)   
PCODE            VARCHAR2(4) 
SDATE            DATE        
*/
public class MoneyVO {
	private int custno;
	private int salenol;
	private int pcost;
	private int amount;
	private int price;
	private String pcode;
	private Timestamp sdate;

	/* Default Constructor */
	public MoneyVO() {
	}

	/* Constructor Using Fields */
	public MoneyVO(int custno, int salenol, int pcost, int amount, int price, String pcode, Timestamp sdate) {
		super();
		this.custno = custno;
		this.salenol = salenol;
		this.pcost = pcost;
		this.amount = amount;
		this.price = price;
		this.pcode = pcode;
		this.sdate = sdate;
	}

	/* Getters and Setters */
	public int getCustno() {
		return custno;
	}

	public void setCustno(int custno) {
		this.custno = custno;
	}

	public int getSalenol() {
		return salenol;
	}

	public void setSalenol(int salenol) {
		this.salenol = salenol;
	}

	public int getPcost() {
		return pcost;
	}

	public void setPcost(int pcost) {
		this.pcost = pcost;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public Timestamp getSdate() {
		return sdate;
	}

	public void setSdate(Timestamp sdate) {
		this.sdate = sdate;
	}

}
