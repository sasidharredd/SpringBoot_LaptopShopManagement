create database laptop_shop_management;
use laptop_shop_management;

drop database laptop_shop_management;

create TABLE product (
  id varchar(20) PRIMARY KEY NOT NULL,
  imglink varchar(255) NOT NULL,
  name varchar(100) NOT NULL,
  descp varchar(255) NOT NULL,
  price double NOT NULL,
  style varchar(100) Not null,
  brand varchar(100) Not null
) ;

CREATE TABLE cart_items (
    id int auto_increment,
    product_id varchar(20) not null,
    user_email varchar(100) not null,
    PRIMARY KEY (id),
    FOREIGN KEY (product_id) REFERENCES product(id)
);
select * from cart_items;

CREATE TABLE wish_list (
    id int auto_increment,
    product_id varchar(20) not null,
    user_email varchar(100) not null,
    PRIMARY KEY (id),
    FOREIGN KEY (product_id) REFERENCES product(id)
);
select * from wish_list;

select * from product where style="newlaptop";
select * from product where style="gaming";
select * from product where style="slim";
select * from product where style="working";

insert into product (id,name,imglink,descp,price,style,brand) values("g1","HP Victus 16-e0076AX",
"https://vsbytes.com/wp-content/uploads/2021/07/16-e0076AX.webp",
"Ryzen 5 5600H 8GB DDR4 3200MHz RAM 512GB SSD 16.1-inches FHD, 60Hz",66990.00,"gaming","HP");


insert into product (id,name,imglink,descp,price,style,brand) values("g2","Acer Nitro AN515-44",
"https://vsbytes.com/wp-content/uploads/2021/07/AN515-44.webp","Ryzen 5 4600H
16GB DDR4 512GB SSD 15.6-inches FHD, 60Hz GTX 1650",79999.99,"gaming","ACER");


insert into product (id,name,imglink,descp,price,style,brand) values("g6","ASUS TUF Gaming A15",
"https://vsbytes.com/wp-content/uploads/2021/07/ASUS-TUF-Gaming-A15-2021-15.6-inch-39.62-cms-FHD-144Hz-AMD-Ryzen-7-4800H.webp",
"AMD Ryzen 7 4800H 8GB  DIMM DDR4 512GB SSD 15.6-inches FHD 144Hz",74990.00,"gaming","ASUS");


insert into product (id,name,imglink,descp,price,style,brand) values("g3","Lenovo IdeaPad Gaming 3",
"https://vsbytes.com/wp-content/uploads/2020/10/Lenovo-IdeaPad-Gaming-3-AMD-Ryzen-5-4600H-15.6-39.62cms-Full-HD-IPS-120Hz-Gaming-Laptop.webp",
"Ryzen 5 4600H 8GB DDR4 512GB SSD 15.6-inches FHD with 120Hz 1650",63100.00,"gaming","LENOVO");


insert into product (id,name,imglink,descp,price,style,brand) values("acer1","Acer Nitro AN515-56",
"https://vsbytes.com/wp-content/uploads/2021/06/AN515-56.webp",
"11th Gen i7 11370H 8GB DDR4 1TB SSD 15.6-inch FHD,144Hz GTX 1650",86999.99,"gaming","ACER");


insert into product (id,name,imglink,descp,price,style,brand) values("g4","HP Pavilion Gaming 15-dk1148TX",
"https://vsbytes.com/wp-content/uploads/2021/07/15-dk1148TX.webp",
"Core i5 8GB DDR4 2933MHz 512GB SSD 15.6-inch FHD, 144Hz GTX 1650",72100.00,"gaming","HP");

insert into product (id,name,imglink,descp,price,style,brand) values("a1","Acer Aspire 7",
"https://static-ecapac.acer.com/media/catalog/product/cache/3406b1b44daa08472620e74815bd5d93/a/s/aspire-7-1_2_2.jpg","10th Generation i5-10300H processor 8 GB of DDR4 512 GB SSD FHD",54990.00,"newlaptop","ACER");


insert into product (id,name,imglink,descp,price,style,brand) values("a2","Acer Predator Helios Gaming",
"https://static-ecapac.acer.com/media/catalog/product/cache/3406b1b44daa08472620e74815bd5d93/u/n/untitled-2_4_3.jpg","11th Genertion Intel i9-11900 processor 16 GB of DDR4 1 TB SSD",139999.00,"gaming","ACER");


insert into product (id,name,imglink,descp,price,style,brand) values("a3","Acer Aspire 3",
"https://static-ecapac.acer.com/media/catalog/product/cache/3406b1b44daa08472620e74815bd5d93/a/s/aspire-3-a315-58-fp-primary_image_3.png","11th Generation Intel Core i5-1135G7 8GB DDR4 128GB SSD 1 TB HDD",58999.00,"slim","ACER");


insert into product (id,name,imglink,descp,price,style,brand) values("a4","Acer Extensa Laptop Intel Pentium Quad Core",
"https://static-ecapac.acer.com/media/catalog/product/cache/3406b1b44daa08472620e74815bd5d93/a/c/acer-extensa-15-ex215-21-21g-31-wp-win10-01_1_1_1.jpg","Intel® Pentium® Silver N5030 processor 256 GB PCIe NVMe SSD 8 GB",28999.00,"working","ACER");


insert into product (id,name,imglink,descp,price,style,brand) values("a5","Acer Aspire Vero",
"https://static-ecapac.acer.com/media/catalog/product/cache/3406b1b44daa08472620e74815bd5d93/v/e/vero2.jpg","Windows 11 Home 64-bit Core i5-1155G7 Processor 12GB 512GB SSD ",57999.00,"slim","ACER");


insert into product (id,name,imglink,descp,price,style,brand) values("l1","IdeaPad Slim 3i (15, Intel)",
"https://www.lenovo.com/medias/lenovo-laptop-ideapad-3-15-intel-hero.png?context=bWFzdGVyfHJvb3R8MzAzNDQ1fGltYWdlL3BuZ3xoNjYvaDY2LzEwNzU3MjQxNTAzNzc0LnBuZ3xjMzU3NWY4OGEyYjYzYTEwOGFlYzhiNWJhODEwYzA1MTlkNDYxODI3ZGQxM2IzYTRhYmY4M2YzY2NjYjhhOGJj","
4 GB Soldered DDR4 2666MHz + 4 GB SO-DIMM DDR4 2666MHz",39190.00,"slim","LENOVO");


insert into product (id,name,imglink,descp,price,style,brand) values("ASUS1","ASUS Zenbook Pro Duo UX581",
"https://dlcdnwebimgs.asus.com/gain/101212fc-bf0a-4af3-836f-ba3e296ced65/w185/fwebp","Windows 10 9th Gen Intel i9 32 GB memory 1 TB PCIe SSD storage",125000.00,"slim","ASUS");

insert into product (id,name,imglink,descp,price,style,brand) values("ASUS2","ASUS Core i9",
"https://rukminim1.flixcart.com/image/832/832/kcauaa80/computer/h/w/c/asus-na-gaming-laptop-original-imaftgegjf4cqbmq.jpeg?q=70","32 GB/1 TB SSD/Windows 10 Home/6 GB Graphics/NVIDIA GeForce RTX 2060",269990.00,"newlaptop","ASUS");

insert into product (id,name,imglink,descp,price,style,brand) values("ASUS3","ASUS Vivobook Flip 14",
"https://m.media-amazon.com/images/I/71C-YpFn0zS._AC_UY327_FMwebp_QL65_.jpg","Intel Core i3-10110U 10th Gen, 14 FHD Touch, Laptop 8GB/256GB SSD",46990.00,"newlaptop","ASUS");


insert into product (id,name,imglink,descp,price,style,brand) values("ASUS4","ASUS Vivobook K15 OLED",
"https://m.media-amazon.com/images/I/81US4GKwGCL._AC_UY327_QL65_.jpg","Intel Core i3-1115G4 11th Gen, Thin and Light Laptop 8GB/512GB SSD",49009.00,"working","ASUS");


insert into product (id,name,imglink,descp,price,style,brand) values("ASUS5","ASUS TUF Dash F15",
"https://m.media-amazon.com/images/I/81mLxU0CcAL._AC_UY327_QL65_.jpg"," FHD 144Hz, Intel Core i5-11300H 11th Gen, RTX 3050 4GB Graphics",67990.00,"working","ASUS");


insert into product(id,name,imglink,descp,price,style,brand) values("h1","HP ENVY x360 Convert 13-bd0515TU",
"https://in-media.apjonlinecdn.com/catalog/product/cache/b3b166914d87ce343d4dc5ec5117b502/c/0/c07613945.png",
"Intel® Core™ i7 processor 512 GB PCIe® NVMe™ TLC SSD",104999.00,"working","HP");


insert into product(id,name,imglink,descp,price,style,brand) values("h2","HP Pavilion x360 Convertible 14-dy1013TU",
"https://in-media.apjonlinecdn.com/catalog/product/cache/b3b166914d87ce343d4dc5ec5117b502/2/1/21c1_pavilion_slinky_14_ffplus_naturalsilver_fpr_win10_coreset_tent_2_5.png",
"11th Generation 512 GB M.2 SSD 14 Intel Iris Xᵉ Graphics",88999.00,"slim","HP");


insert into product(id,name,imglink,descp,price,style,brand) values("h3","HP Pavilion Aero Laptop 13-be0208AU",
"https://in-media.apjonlinecdn.com/catalog/product/cache/b3b166914d87ce343d4dc5ec5117b502/2/1/21c1_pavilion_zurg_13_palerosegold_nt_nonodd_fpr_upccam_freedos_coreset_frontleft_3.png",
"AMD Ryzen™ 7 processor Windows 11 1 TB HDD M.2 SSD 13.3",86999.00,"Working","HP");




insert into product(id,name,imglink,descp,price,style,brand) values("h4","HP Chromebook x360 AMD 3015CE",
"https://m.media-amazon.com/images/I/81hoonPUdxL._AC_UY327_FMwebp_QL65_.jpg",
" AMD 3015CE-4GB SDRAM/64GB eMMC Storage 14-inch Touchscreen",30990.00,"slim","HP");



insert into product(id,name,imglink,descp,price,style,brand) values("h5","HP Victus 16 E Series",
"https://i.gadgets360cdn.com/products/large/HP-Victus-DB-897x800-1627278526.jpg?downsize=*:180",
"Windows 10 laptop with a 16.10 8GB of RAM.",59990.00,"working","HP");




insert into product(id,name,imglink,descp,price,style,brand) values("h6","HP Spectre x360 Convertible 13-aw2003TU",
"https://in-media.apjonlinecdn.com/catalog/product/cache/b3b166914d87ce343d4dc5ec5117b502/c/0/c06472419_7.png",
"11th Gen Intel® Core™ i5 processor Windows 10 512 GB SSD 13.3",99999.00,"working","HP");



insert into product (id,name,imglink,descp,price,style,brand) values("l2","ThinkBook 14 Gen 2 (Intel)",
"https://www.lenovo.com/medias/ThinkBook-14-Gen-2-Intel-hero.png?context=bWFzdGVyfHJvb3R8NjYwMDh8aW1hZ2UvcG5nfGg2NC9oZjYvMTMwMzMyMzY0NjM2NDYucG5nfDdlZWU5OGJlYzllYWI0OTM2NDcyMjMwYzA4ZmY3OWRjZDFkNTI4NjgxNWJhOGRmNmZlYTE3OWUzODhmOWQyZjM ","8 GB Soldered DDR4 3200MHz",82990.00,"working","LENOVO");


insert into product (id,name,imglink,descp,price,style,brand) values("l3","Thinkpad E14 11th Gen (Intel)",
"https://www.lenovo.com/medias/Thinkpad-E14-Gen-2-Intel-subseries-hero.png?context=bWFzdGVyfHJvb3R8NjIwOTZ8aW1hZ2UvcG5nfGhmOC9oZjEvMTI5OTUxNzcwODcwMDYucG5nfGMwN2NhNDE4N2U1NDU2ZjBjMDhmN2FmNGUwNDUxNmVlNGNhMmIxNDMxNjhhNWEwMTM5ZmRmZDNlY2M4NDM0MGE","4 GB SO-DIMM DDR4 3200MHz",48990.00,"working","LENOVO");


insert into product (id,name,imglink,descp,price,style,brand) values("l4","Lenovo V15 (AMD)",
"https://www.lenovo.com/medias/ww-lenovo-laptop-v15-amd-hero.png?context=bWFzdGVyfHJvb3R8NDM4OTQyfGltYWdlL3BuZ3xoZTYvaDg2LzEwNzc4MDE1NzYwNDE0LnBuZ3xjZDdhZjRjMjAzMjgwMDVlY2I4NjM0YWZlM2UzNGM1MWM4NTAwMzg0YzA1MTFhNDQwMWMzYzdiMzQ5ZWYwYmFi","4 GB Soldered  + 4 GB SO-DIMM ",42990.00,"newlaptop","LENOVO"); 

insert into product (id,name,imglink,descp,price,style,brand) values("l6","Flex 5i (14,Intel)",
"https://www.lenovo.com/medias/Flex5-subseries-hero-1.png?context=bWFzdGVyfHJvb3R8OTEyODV8aW1hZ2UvcG5nfGg3NC9oNzUvMTE2MTM3NzAyNTIzMTgucG5nfDFhYmFhY2U1N2M3YmFkOTE3Yjk3MTY0OGRhYmIxYmI1ZTcwZDY5MjMyODQ3MWY4NmI3MTdiYTE5NzVlNThlYjk","16 GB Soldered DDR4 3200MHz",64800.00,"newlaptop","LENOVO");

insert into product (id,name,imglink,descp,price,style,brand) values("l5","Yoga 7 Gen 6 (14, AMD)",
"https://www.lenovo.com/medias/Yoga-7-Gen-6-14-AMD-SS-Hero.png?context=bWFzdGVyfHJvb3R8NjM5NjV8aW1hZ2UvcG5nfGhjMi9oNDgvMTM0NDI3MzUxNzc3NTgucG5nfGNmZTcxNjE5ZTA3ZjkyYjliZmFlOTBkYjlkMWY5MGMzODRlYzBhMmM4N2ZjY2I3ZjFlZDQwNzRlZDYxOGExZmE","16 GB Soldered LPDDR4x 4266MHz",94490.00,"newlaptop","LENOVO");

select*from role;
select*from user;
select*from users_roles;
select * from product;
select * from cart_items;
select * from wish_list;
select * from orders;
commit;


 