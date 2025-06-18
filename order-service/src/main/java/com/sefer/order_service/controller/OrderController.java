package com.sefer.order_service.controller;

import com.sefer.order_service.dto.OrderLineItemsDto;
import com.sefer.order_service.dto.OrderRequest;
import com.sefer.order_service.model.Order;
import com.sefer.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }
    @GetMapping
    public List<Order> getOrderLineItems() {
        return orderService.getOrders();
    }
}
