---------------------------------------------------------------------------------------
--- CATALOG 
---------------------------------------------------------------------------------------
INSERT INTO SERVICE_PROVIDER (id, name) VALUES (1, 'Sri Sai Dry-Fruits Store');

---------------------------------------------------------------------------------------
--- CATEGORIES
---------------------------------------------------------------------------------------
INSERT INTO CATEGORY (id, name) VALUES (1, 'Dry Fruits , Nuts & Seeds');
INSERT INTO CATEGORY (id, name) VALUES (2, 'Milk & Supply');
INSERT INTO CATEGORY (id, name) VALUES (3, 'Fruits & Vegtables');
INSERT INTO CATEGORY (id, name) VALUES (4, '');
INSERT INTO CATEGORY (id, name) VALUES (5, 'Dry Fruits Gifting');
INSERT INTO CATEGORY (id, name) VALUES (11, 'Almonds');
INSERT INTO CATEGORY (id, name) VALUES (12, 'Cashews(Kaju)');
INSERT INTO CATEGORY (id, name) VALUES (13, 'Peanuts');

---------------------------------------------------------------------------------------
--- PRODUCTS
---------------------------------------------------------------------------------------
INSERT INTO PRODUCT (id, name) VALUES (1, 'Salted Almonds');
INSERT INTO PRODUCT (id, name) VALUES (2, 'Roasted Almonds');
INSERT INTO PRODUCT (id, name) VALUES (3, 'Plain Almonds');
INSERT INTO PRODUCT (id, name) VALUES (4, 'Masala Almonds');
INSERT INTO PRODUCT (id, name) VALUES (5, 'Salted Cashews(Kaju)');
INSERT INTO PRODUCT (id, name) VALUES (6, 'Roasted Cashews(Kaju)');
INSERT INTO PRODUCT (id, name) VALUES (7, 'Plain Cashews(Kaju)');
INSERT INTO PRODUCT (id, name) VALUES (8, 'Masala Cashews(Kaju)');
INSERT INTO PRODUCT (id, name) VALUES (9, 'Salted Peanuts');
INSERT INTO PRODUCT (id, name) VALUES (10, 'Masala Peanuts');
INSERT INTO PRODUCT (id, name) VALUES (11, 'Roasted Peanuts');
INSERT INTO PRODUCT (id, name) VALUES (12, 'Fried Peanuts');
INSERT INTO PRODUCT (id, name) VALUES (13, 'Mukhwas');
INSERT INTO PRODUCT (id, name) VALUES (14, 'Raisins');
INSERT INTO PRODUCT (id, name) VALUES (15, 'Walnut');
INSERT INTO PRODUCT (id, name) VALUES (16, 'Pista');

---------------------------------------------------------------------------------------
--- SKUS
---------------------------------------------------------------------------------------

INSERT INTO SKU (id, name,price) VALUES (1, 'Salted Almonds - 250 grms',250);
INSERT INTO SKU (id, name,price) VALUES (2, 'Salted Almonds - 500 grms',475);
INSERT INTO SKU (id, name,price) VALUES (3, 'Salted Almonds - 1KG grms',900);

INSERT INTO SKU (id, name,price) VALUES (4, 'Roasted Almonds - 250 grms',200);
INSERT INTO SKU (id, name,price) VALUES (5, 'Roasted Almonds - 500 grms',450);
INSERT INTO SKU (id, name,price) VALUES (6, 'Roasted Almonds - 1KG',850);

INSERT INTO SKU (id, name,price) VALUES (7, 'Plain Almonds - 500 grms',350);
INSERT INTO SKU (id, name,price) VALUES (8, 'Plain Almonds - 1KG',350);


INSERT INTO SKU (id, name,price) VALUES (9, 'Mukhwas - 1KG',1000);
INSERT INTO SKU (id, name,price) VALUES (10, 'Raisins - 1KG ',1000);
INSERT INTO SKU (id, name,price) VALUES (11, 'Walnut - 1KG',1000);
INSERT INTO SKU (id, name,price) VALUES (12, 'Pista - 1KG grms',1000);


---------------------------------------------------------------------------------------
--- CATALOG CATEGORIES
---------------------------------------------------------------------------------------

INSERT INTO  catalog_categories VALUES(1,1);
INSERT INTO  catalog_categories VALUES(1,2);
INSERT INTO  catalog_categories VALUES(1,3);
INSERT INTO  catalog_categories VALUES(1,4);
INSERT INTO  catalog_categories VALUES(1,5);
INSERT INTO  catalog_categories VALUES(1,11);
INSERT INTO  catalog_categories VALUES(1,12);
INSERT INTO  catalog_categories VALUES(1,13);

---------------------------------------------------------------------------------------
--- CATEGORY-SUB_CATEGORIS
---------------------------------------------------------------------------------------
INSERT INTO  category_sub_categories VALUES(1,11);
INSERT INTO  category_sub_categories VALUES(1,12);
INSERT INTO  category_sub_categories VALUES(1,13);

---------------------------------------------------------------------------------------
--- CATEGORY-PRODUCTS
---------------------------------------------------------------------------------------
INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(11,1);
INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(11,2);
INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(11,3);
INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(11,4);

INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(12,5);
INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(12,6);
INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(12,7);
INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(12,8);

INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(13,9);
INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(13,10);
INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(13,11);
INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(13,12);

INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(1,13);
INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(1,14);
INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(1,15);
INSERT INTO CATEGORY_PRODUCTS(CATEGORY_ID,PRODUCTS_ID) values(1,16);


---------------------------------------------------------------------------------------
--- PRODUCT-SKUS
---------------------------------------------------------------------------------------
INSERT INTO PRODUCT_SKUS(PRODUCT_ID,SKUS_ID) values(1,1);
INSERT INTO PRODUCT_SKUS(PRODUCT_ID,SKUS_ID) values(1,2);
INSERT INTO PRODUCT_SKUS(PRODUCT_ID,SKUS_ID) values(1,3);
INSERT INTO PRODUCT_SKUS(PRODUCT_ID,SKUS_ID) values(1,4);
INSERT INTO PRODUCT_SKUS(PRODUCT_ID,SKUS_ID) values(1,5);
INSERT INTO PRODUCT_SKUS(PRODUCT_ID,SKUS_ID) values(1,6);
INSERT INTO PRODUCT_SKUS(PRODUCT_ID,SKUS_ID) values(1,7);
INSERT INTO PRODUCT_SKUS(PRODUCT_ID,SKUS_ID) values(1,8);

INSERT INTO PRODUCT_SKUS(PRODUCT_ID,SKUS_ID) values(13,9);
INSERT INTO PRODUCT_SKUS(PRODUCT_ID,SKUS_ID) values(14,10);
INSERT INTO PRODUCT_SKUS(PRODUCT_ID,SKUS_ID) values(15,11);
INSERT INTO PRODUCT_SKUS(PRODUCT_ID,SKUS_ID) values(16,12);
COMMIT;