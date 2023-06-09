package com.example.roleBased.dto;
import lombok.*;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartDto {

    private int cartId;
    private int quantity;
    private double totalPrice;
    private ProductDto product;
    private UserDto userDto;
    private  int u_cart_id=0;



    public int getU_cart_id() {
        u_cart_id++;
        return u_cart_id;
    }

    public void setU_cart_id(int u_cart_id) {
        this.u_cart_id = u_cart_id;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
