struct Vector2(let X: i32, let Y: i32);

implement Vector2
{
  operator func add(other: Vector2) -> Vector2::new(X + other.X, Y + other.Y);
  operator func sub(other: Vector2) -> Vector2::new(X - other.X, Y - other.Y);
}
