import io.cucumber.java.en.Then;

import org.testng.Assert;
import org.mockito.InjectMocks;
import example.model.Car;
import example.service._

class CarModel {

  @InjectMocks
  val service = new CarServiceImpl()

  @Then("Car model should be test")
  def checkModel(): Unit = {
    val car = service.createCar();
     Assert.assertEquals(car.model, "test");
  }
}
