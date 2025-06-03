//A class, module, or function should be open for extension but closed for modification.
from abc import ABC, abstractmethod

# Base class - closed for modification, open for extension
        class DiscountStrategy(ABC):
        @abstractmethod
        def apply_discount(self, total):
        pass

        class NoDiscount(DiscountStrategy):
        def apply_discount(self, total):
        return total

        class PercentageDiscount(DiscountStrategy):
        def apply_discount(self, total):
        return total * 0.9  # 10% discount

        class Checkout:
        def __init__(self, discount_strategy: DiscountStrategy):
        self.discount_strategy = discount_strategy

        def calculate_total(self, total):
        return self.discount_strategy.apply_discount(total)

        # Usage:
        checkout1 = Checkout(NoDiscount())
        print(checkout1.calculate_total(100))  # Output: 100

        checkout2 = Checkout(PercentageDiscount())
        print(checkout2.calculate_total(100))  # Output: 90
//you can add new discounts hence it follows the principle

//the following violates open/closd principle because adding a new discount requires modifying the calculate_total method,can introduce bugs
        class Checkout:
        def calculate_total(self, total, discount_type):
        if discount_type == "none":
        return total
        elif discount_type == "percentage":
        return total * 0.9
        elif discount_type == "bogo":
        return total / 2
