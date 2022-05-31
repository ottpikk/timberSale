INSERT INTO customer(name,phone,email,deliveryAddress) VALUES('John Black','+372 568 4897','johnblack@gmail.com','Silver Street 34');
INSERT INTO customer(name,phone,email,deliveryAddress) VALUES('Tim Greem','+372 698 7854','timgreen@gmail.com','Iron Street 45a');
INSERT INTO customer(name,phone,email,deliveryAddress) VALUES('Jimmy White','+372 123 4567','jwhite@gmail.com','Steel Street 3-123');
INSERT INTO customer(name,phone,email,deliveryAddress) VALUES('Tommy Blue','+372 987 6543','tommy.blue@gmail.com','Gold Street 15');
INSERT INTO customer(name,phone,email,deliveryAddress) VALUES('Johnny Red','+372 345 6789','johnnyr@gmail.com','Palladium Street 6000');

INSERT INTO employee(name,email,phone) VALUES('Jane Oak','jane@company.com','+372 456 7894');
INSERT INTO employee(name,email,phone) VALUES('Sarah Pine','sarah@company.com','+372 456 4561');
INSERT INTO employee(name,email,phone) VALUES('Jenny Spruce','jenny@company.com','+372 456 1237');

INSERT INTO supplier(companyName,contactPerson,phone,email,address,bankAccount) VALUES('Good Mill AS','Martin Salesman','+372 988 6547','martin@good.com','Random Address 32','EE511145645687708045');
INSERT INTO supplier(companyName,contactPerson,phone,email,address,bankAccount) VALUES('Baltics Mill AS','Thomas Seller','+372 951 6284','thomas@balticsmill.com','Random Address 123','EE511100000087708045');
INSERT INTO supplier(companyName,contactPerson,phone,email,address,bankAccount) VALUES('Timber AS','Carol Sales','+372 852 7418','carol@timber.com','Random Address 125','EE51118889994443277');

INSERT INTO material(type,length,width,thickness,unit,price,amountInStock,supplierId) VALUES('Spruce','6000','250','50','m3','420.5','51',1);
INSERT INTO material(type,length,width,thickness,unit,price,amountInStock,supplierId) VALUES('Spruce','5700','250','75','m3','395.5','124',2);
INSERT INTO material(type,length,width,thickness,unit,price,amountInStock,supplierId) VALUES('Spruce','3000','50','25','m3','390.0','1',3);
INSERT INTO material(type,length,width,thickness,unit,price,amountInStock,supplierId) VALUES('Spruce','3900','150','150','pcs','480.0','2000',1);
INSERT INTO material(type,length,width,thickness,unit,price,amountInStock,supplierId) VALUES('Spruce','4200','75','50','m3','385.0','18',1);
INSERT INTO material(type,length,width,thickness,unit,price,amountInStock,supplierId) VALUES('Pine','4200','85','44','m1','4.1','8400',3);
INSERT INTO material(type,length,width,thickness,unit,price,amountInStock,supplierId) VALUES('Pine','5400','125','25','m3','360.84','38',1);
INSERT INTO material(type,length,width,thickness,unit,price,amountInStock,supplierId) VALUES('Pine','6000','100','32','m3','392.45','245',2);

INSERT INTO transporter(companyName,maxWeight,contactPerson,phone,email,address,bankaccount) VALUES('Fast Drive inc.','7800','Sam Nails','+372 4587 9854','sam@fast.com','AnotherRandom 34','EE98798798700004554');
INSERT INTO transporter(companyName,maxWeight,contactPerson,phone,email,address,bankaccount) VALUES('Truckers inc.','24000','Elis Hammer','+372 6544 5555','elis@trucker.com','AnotherRandom 654','EE985500055544468');

