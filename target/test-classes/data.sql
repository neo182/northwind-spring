insert into ApplicationUser (id, userName, password) values (1, 'srt', 'password');
insert into ApplicationUser (id, userName, password) values (2, 'neo', 'password');

insert into Category (id, name, description) values(1, 'Beverages','Soft drinks, coffees, teas, beers, and ales');
insert into Category (id, name, description) values(2, 'Condiments','Sweet and savory sauces, relishes, spreads, and seasonings');

insert into Shipper (id, companyName, phone) values (1, 'Speedy Express', '(503) 555-9831');
insert into Shipper (id, companyName, phone) values (2, 'United Package', '(503) 555-3199');

insert into Customer (id, companyName, contactName, contactTitle, address, city, region, postalCode, country, phone, fax)
    values (1, 'Alfreds Futterkiste', 'Maria Anders', 'Sales Representative', 'Obere Str. 57', 'Berlin', '', '02209', 'Germany', '030-0074321','030-0076545');
insert into Customer (id, companyName, contactName, contactTitle, address, city, region, postalCode, country, phone, fax)
    values (2, 'Ana Trujillo Emparedados y helados', 'Ana Trujillo', 'Owner', 'Avda. de la Constitución 2222', 'México D.F.', '', '05021', 'Mexico', '(5) 555-4729','(5) 555-3745');

insert into Supplier (id, companyName, contactName, contactTitle, address, city, region, postalCode, country, phone, fax)
    values (1, 'Exotic Liquids', 'Charlotte Cooper', 'Purchasing Manager', '49 Gilbert St.', 'London', '', 'EC1 4SD', 'UK', '(171) 555-2222','');
insert into Supplier (id, companyName, contactName, contactTitle, address, city, region, postalCode, country, phone, fax)
    values (2, 'New Orleans Cajun Delights', 'Shelley Burke', 'Order Administrator', 'P.O. Box 78934', 'New Orleans', 'LA', '70117', 'USA', '(100) 555-4822','');

insert into Employee(id, firstName, lastName, title, titleOfCourtesy, birthDate, hireDate, address, city, region, postalCode, country, homePhone, extension, notes, reportsTo)
    values (1, 'Davolio', 'Nancy', 'Sales Representative', 'Ms.', '1968-08-12', '1992-01-05','507 - 20th Ave. E.', 'Seattle', 'WA', '98122',  'USA', '(206) 555-9857','5467', 'Education includes a BA in psychology from Colorado State University.', 'Fuller, Andrew');
insert into Employee(id, firstName, lastName, title, titleOfCourtesy, birthDate, hireDate, address, city, region, postalCode, country, homePhone, extension, notes, reportsTo)
    values (2, 'Fuller', 'Andrew', 'Vice President, Sales', 'Dr.', '1968-02-12', '1992-01-05','908 W. Capital Way', 'Tacoma', 'WA', '98401',  'USA', '(206) 555-9482','3457', 'Andrew received his BTS commercial and a Ph.D. in international marketing from the University of Dallas.  ', '');

insert into SalesOrder (id, orderDate, requiredDate, shippedDate, freight, shipName, shipAddress, shipCity, shipRegion, shipPostalCode, shipCountry, customer_id, employee_id, shipper_id)
    values (1, '1996-07-04', '1996-08-01', '1996-07-16', '32.38', 'Vins et alcools Chevalier', '59 rue de l Abbaye', 'Reims', '','51100','France', 1, 1, 1);
insert into SalesOrder (id, orderDate, requiredDate, shippedDate, freight, shipName, shipAddress, shipCity, shipRegion, shipPostalCode, shipCountry, customer_id, employee_id, shipper_id)
    values (2, '1996-08-04', '1996-09-01', '1996-08-16', '11.61', 'Toms Spezialitäten', 'Luisenstr. 48', 'Münster', '','44087','Germany', 1, 1, 1);


insert into Product (id, productName, quantityPerUnit, unitPrice, unitsInStock, unitsInOrder, reoderLevel, discontinued, category_id, supplier_id)
    values (1, 'Chai', '10 boxes x 20 bags', 18, 39, 0, 10, FALSE, 1, 1);
insert into Product (id, productName, quantityPerUnit, unitPrice, unitsInStock, unitsInOrder, reoderLevel, discontinued, category_id, supplier_id)
    values (2, 'Chang', '24 - 12 oz bottles', 19, 17, 40, 25, FALSE, 1, 1);

insert into SalesOrderDetails (id, unitPrice, quantity, discount, salesOrder_id, product_id) values(1, 14.00, 12, 0, 1, 1);
insert into SalesOrderDetails (id, unitPrice, quantity, discount, salesOrder_id, product_id) values(2, 9.80, 10, 0, 1, 2);    