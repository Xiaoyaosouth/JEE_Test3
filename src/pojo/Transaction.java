package pojo;

import java.util.Date;
import javax.validation.constraints.*;
import org.springframework.format.annotation.*;

public class Transaction {
	// 产品编号
	@NotNull
	private Long productId;

	// 用户编号
	@NotNull
	private Long userId;

	// 交易日期
	@Future
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull
	private Date date;

	// 价格
	@NotNull
	@DecimalMin(value = "0.1")
	private Double price;

	// 数量
	@Min(1)
	@Max(100)
	@NotNull
	private Integer quantity;

	// 交易金额
	@NotNull
	@DecimalMax("500000.00")
	@DecimalMin("1.00")
	private Double amout;

	// 邮件
	@Pattern(regexp = "^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@"
			+ "([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$", message = "不符合邮件格式")
	private String email;

	// 备注
	@Size(min = 0, max = 256)
	private String note;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getAmout() {
		return amout;
	}

	public void setAmout(Double amout) {
		this.amout = amout;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
