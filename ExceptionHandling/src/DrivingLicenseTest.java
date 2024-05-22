public class DrivingLicenseTest {
    public void drivingTestAgeLimit(int age)throws DrivingLicenseTestAgeException{
        if (age < 16){
            throw new DrivingLicenseTestAgeException("You cannot take the driving license test due to your age",new RuntimeException());
        }
    }
}
