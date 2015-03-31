# Data Access

Customer (model)
CustomerDao (interface for Dao class)
CustomerDaoClass (performs the actual queries)
CustomerRowMapper (maps database fields to Customer model properties, uses model)


CustomerDao
    - uses model as a type in parameters list
CustomerDaoClass
    - implements CustomerDao interface
    - uses CustomerRowMapper in queries
    - uses Customer model as type (not currently, but will be)
CustomerRowMapper
    - uses Customer as a type
Customer (model)
    - standalone, not external dependencies
CustomerController
    - uses @Autowired CustomerDao as a type
    - uses Customer as a type (not currently, but likely)
    
    
1. Create model (Car)
2. Create DAO interface (CarDao)
3. Create DAO class (CarDaoPostgresql)
4. Create row mapper (CarRowMapper)
5. Create controllers (CreateCarController)
    CreateCar
    ReadOneCar
    ReadAllCars
    UpdateCar
    DeleteCar
