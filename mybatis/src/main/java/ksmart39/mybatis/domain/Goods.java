package ksmart39.mybatis.domain;
//1
public class Goods {
	
	private String goodsCode;
	private String goodsName;
	private String goodsPrice;
	private String goodsSellerId;
	private String goodsRegDate;

	private Member member; //1:1 매칭일때, 1:다 일때는 List<member> 

	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsSellerId() {
		return goodsSellerId;
	}

	public void setGoodsSellerId(String goodsSellerId) {
		this.goodsSellerId = goodsSellerId;
	}

	public String getGoodsRegDate() {
		return goodsRegDate;
	}

	public void setGoodsRegDate(String goodsRegDate) {
		this.goodsRegDate = goodsRegDate;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Goods [goodsCode=" + goodsCode + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice
				+ ", goodsSellerId=" + goodsSellerId + ", goodsRegDate=" + goodsRegDate + ", member=" + member + "]";
	}
	
	
}
