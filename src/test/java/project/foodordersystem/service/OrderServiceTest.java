package project.foodordersystem.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import project.foodordersystem.dto.OrderRequestDto;
import project.foodordersystem.dto.OrderResponseDto;
import project.foodordersystem.enums.OrderStatus;
import project.foodordersystem.enums.Payment;
import project.foodordersystem.exception.NotFoundException;
import project.foodordersystem.model.Food;
import project.foodordersystem.model.Order;
import project.foodordersystem.repository.FoodRepository;
import project.foodordersystem.repository.OrderRepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class OrderServiceTest {


}