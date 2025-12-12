package com.ecom.backend.config;

import com.ecom.backend.model.Category;
import com.ecom.backend.model.Product;
import com.ecom.backend.repository.CategoryRepository;
import com.ecom.backend.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class DataInitializer {
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository, CategoryRepository categoryRepository) {
        return args -> {
            if (categoryRepository.count() == 0) {
                Category electronics = new Category();
                electronics.setName("Electronics");
                categoryRepository.save(electronics);

                Category clothing = new Category();
                clothing.setName("Clothing");
                categoryRepository.save(clothing);

                Category accessories = new Category();
                accessories.setName("Accessories");
                categoryRepository.save(accessories);

                Category shoes = new Category();
                shoes.setName("Shoes");
                categoryRepository.save(shoes);
            }


            if (productRepository.count() == 0) {
                Product product1 = new Product();
                product1.setName("Premium Leather Jacket");
                product1.setDescription("A high-quality leather jacket made from genuine leather. Perfect for cold weather and stylish enough for any occasion.");
                product1.setPrice(199.99);
                product1.setCategory("clothing");
                product1.setImageUrl("https://www.spidi.com/media/catalog/product/cache/3758c898bafb7a1a412b22575cfbc92c/s/p/spidi_premium_1_1.jpg");
                product1.setStock(25);
                productRepository.save(product1);

                Product product2 = new Product();
                product2.setName("Wireless Headphones");
                product2.setDescription("High-definition sound quality with noise cancellation. Bluetooth connectivity with 20-hour battery life.");
                product2.setPrice(149.99);
                product2.setCategory("electronics");
                product2.setImageUrl("https://hottipsusa.com/cdn/shop/products/Pro_Overear_Wireless_Headphones_Main_White_websize.jpg?v=1670266033");
                product2.setStock(50);
                productRepository.save(product2);

                Product product3 = new Product();
                product3.setName("Smart Watch");
                product3.setDescription("Track your fitness, receive notifications, and more with this sleek smartwatch. Water-resistant and long battery life.");
                product3.setPrice(129.99);
                product3.setCategory("electronics");
                product3.setImageUrl("https://appleme.lk/wp-content/uploads/2022/08/Meimi-Kids-Safety-Tracking-Smart-Watch.jpg");
                product3.setStock(30);
                productRepository.save(product3);

                Product product4 = new Product();
                product4.setName("Organic Cotton T-Shirt");
                product4.setDescription("Made from 100% organic cotton, this t-shirt is both comfortable and environmentally friendly.");
                product4.setPrice(24.99);
                product4.setCategory("clothing");
                product4.setImageUrl("https://images-cdn.ubuy.co.in/65ed10f298092e4504113f86-packitcute-womens-cotton-crewneck-t.jpg");
                product4.setStock(100);
                productRepository.save(product4);

                Product product5 = new Product();
                product5.setName("Stainless Steel Water Bottle");
                product5.setDescription("Keep your drinks cold for 24 hours or hot for 12 hours with this vacuum-insulated water bottle.");
                product5.setPrice(19.99);
                product5.setCategory("accessories");
                product5.setImageUrl("https://coolplanet.lk/cdn/shop/files/0024_DSC01567copy.jpg?v=1742303071&width=1200");
                product5.setStock(75);
                productRepository.save(product5);

                Product product6 = new Product();
                product6.setName("Bluetooth Speaker");
                product6.setDescription("Portable speaker with crystal clear sound and deep bass. Perfect for outdoor activities.");
                product6.setPrice(79.99);
                product6.setCategory("electronics");
                product6.setImageUrl("https://www.dimprice.co.uk/image/cache/catalog/products_2022/1-1-800x800.jpg");
                product6.setStock(40);
                productRepository.save(product6);

                Product product7 = new Product();
                product7.setName("Running Shoes");
                product7.setDescription("Lightweight and comfortable running shoes with excellent support and cushioning.");
                product7.setPrice(89.99);
                product7.setCategory("shoes");
                product7.setImageUrl("https://assets.myntassets.com/w_412,q_60,dpr_2,fl_progressive/assets/images/27155320/2024/1/27/67d141aa-2d39-47b2-84d4-2d6cfbbb8e201706364417421ASICSGEL-Nimbus26Lite-ShowMenTexturedRunningSportsShoes1.jpg");
                product7.setStock(35);
                productRepository.save(product7);

                Product product8 = new Product();
                product8.setName("Backpack");
                product8.setDescription("Durable backpack with multiple compartments and laptop sleeve. Perfect for daily use or travel.");
                product8.setPrice(49.99);
                product8.setCategory("accessories");
                product8.setImageUrl("https://mmsrilanka.com/image/cache/catalog/Pavani/Lenovo%20Monitors/4X40T84058-550x550.jpg");
                product8.setStock(60);
                productRepository.save(product8);

            }

        };
    }


}

