def number(num)
  ans = []
  for i in 1.upto(num) do
    x = 2 * i - 1
    y = 2 * i
    x1 = x ** 4
    y1 = y ** 4
    ans << x1
    ans << -y1
  end
  ans.sum
end

puts number(2)
