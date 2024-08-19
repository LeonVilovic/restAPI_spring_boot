USE [testDB]
GO

INSERT INTO [dbo].[users] ([address], [created_date], [email], [first_name], [last_name], [last_modified_date])
VALUES 
('123 Elm Street', '2024-08-01T10:00:00.0000000', 'john.doe@example.com', 'John', 'Doe', '2024-08-01T10:00:00.0000000'),
('456 Oak Avenue', '2024-08-02T11:00:00.0000000', 'jane.smith@example.com', 'Jane', 'Smith', '2024-08-02T11:00:00.0000000'),
('789 Pine Road', '2024-08-03T12:00:00.0000000', 'alice.johnson@example.com', 'Alice', 'Johnson', '2024-08-03T12:00:00.0000000'),
('101 Maple Lane', '2024-08-04T13:00:00.0000000', 'bob.martin@example.com', 'Bob', 'Martin', '2024-08-04T13:00:00.0000000'),
('202 Birch Street', '2024-08-05T14:00:00.0000000', 'lisa.white@example.com', 'Lisa', 'White', '2024-08-05T14:00:00.0000000'),
('303 Cedar Blvd', '2024-08-06T15:00:00.0000000', 'tom.jones@example.com', 'Tom', 'Jones', '2024-08-06T15:00:00.0000000'),
('404 Spruce Drive', '2024-08-07T16:00:00.0000000', 'emily.davis@example.com', 'Emily', 'Davis', '2024-08-07T16:00:00.0000000'),
('505 Fir Circle', '2024-08-08T17:00:00.0000000', 'michael.brown@example.com', 'Michael', 'Brown', '2024-08-08T17:00:00.0000000');

INSERT INTO [dbo].[accounts] ([account_number], [account_type], [balance], [creation_date], [last_modivied_date], [user_id])
VALUES 
('ACC123456789', 'Checking', 1500.00, '2024-08-01T10:00:00.0000000', '2024-08-01T10:00:00.0000000', 1),
('ACC987654321', 'Savings', 2500.00, '2024-08-02T11:00:00.0000000', '2024-08-02T11:00:00.0000000', 2),
('ACC112233445', 'Business', 5000.00, '2024-08-03T12:00:00.0000000', '2024-08-03T12:00:00.0000000', 3),
('ACC223344556', 'Checking', 1800.00, '2024-08-04T13:00:00.0000000', '2024-08-04T13:00:00.0000000', 4),
('ACC334455667', 'Savings', 3000.00, '2024-08-05T14:00:00.0000000', '2024-08-05T14:00:00.0000000', 5),
('ACC445566778', 'Business', 6000.00, '2024-08-06T15:00:00.0000000', '2024-08-06T15:00:00.0000000', 6),
('ACC556677889', 'Checking', 2200.00, '2024-08-07T16:00:00.0000000', '2024-08-07T16:00:00.0000000', 7),
('ACC667788990', 'Savings', 3500.00, '2024-08-08T17:00:00.0000000', '2024-08-08T17:00:00.0000000', 8);

