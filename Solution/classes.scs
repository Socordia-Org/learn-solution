// 1: A struct is a value type and is normally allocated on the stack.

abstract class Car(_color: string)
{
  let color: string = _color;

  virtual func GetDescription(): string;
}

implement Car
{
  func GetDescription() => _color;
}

class Audi extends Car("Red")
{

}

class BMW extends Car("Blue")
{

}

func main()
{
  let audi = Audi::new();
  print(audi.GetDescription());
}
