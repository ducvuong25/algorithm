## ÔN TẬP THUẬT TOÁN
### Bài 1: tính tổng của một số; mở rộng ra tính tổng của các số chẵn| lẻ  của một số nguyên
```
input:      8676474
output:     42
```
### Bài 2: Tính tổng các số trong một mảng (dễ hơn)
```
input:      {1,2,3,4,5}
output:     15
```
### Bài 3: Sắp xếp một mảng tăng dần hoặc giảm dần (bubble short)
```
input:      {8,3,9,2,7}
ouput:      {2,3,7,8,9}
```
### Bài 4: Sắp xếp một mảng tăng dần hoặc giảm dần (quick short)
```
input:      {8,3,9,2,7}
ouput:      {2,3,7,8,9};
```
### Bài 5: Tìm ra các số  unique (chỉ xuất hiện một lần)
```
input:      {1,2,3,1,4,5,3,4}
output:     {2,5}, hoặc in ra 2,5
```
### Bài 6: Kiểm tra xem mảng có phần tử trùng nhau hay không?
```
input:      {1,2,3,1,4,5,3,4}
output:     true
```
### Bài 7: In ra dãy n số fibonacci đầu tiên
- Dùng cả 2 phương pháp loop và recusion
```
input: 1
ouput: 0

input: 2
ouput: 0 1

input: 3
ouput: 0 1 1

input: 10
ouput: 0 1 1 2 3 5 8 13 21 34
```

### Bài 8: Kiểm tra xem một số có phải là số nguyên tố không?
```
input:      7
output:     true
```
### Bài 9: In ra các số nguyên tố từ 1 cho đến n (kể cả n nếu n là cũng là số nguyên tố) 
```
input:      100
output:     2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
``` 
- Lưu ý rằng để biết 1 số n có phải là prime hay không thì chỉ cần chia thử từ 2 đến Math.sqrt(n), nếu ko chia hết cho số nào thì là số nguyên tố 
- Dùng cả 2 trường hợp gọi|không gọi method con
### Bài 10: đảo ngược vị trí của các phần tử trong mảng
```
input:      {1,2,3,4,5}
output:     {5,4,3,2,1}
```
### Bài 11: Cho số N, in ra  số nguyên tố lớn nhất nhưng nhỏ hơn N
```
input:      100
output:     97

input:      3
output:     2
```

### Bài 12: Kiểm tra xem một chuỗi các brace có phải là balance hay không?
```
input: "({[]})"
ouput: true
```
### Bài 13: Tính giai thừa của một số
```
input: 5
ouput: 120
```
- Dùng cả 2 phương pháp loop và recusion
- Chú ý rằng giai thừa của 1 và 0 đều bằng 1


### Bài 14: Một công ty quy định nếu nhân viên đi muộn thì sẽ bị phạt với số tiền là là ``n * m``, với n là một số tiền cố định, m là số lần vi phạm.
#### Yêu cầu tính tổng số tiền phạt sau lần phạt thứ n.
- Dùng cả 2 phương pháp loop và recusion
- ví dụ với n = 2k;
```
| lần phạt | tiền phạt mỗi lần | tổng tiền phạt lần phạt thứ n |
|----------|-------------------|-------------------------------|
| lần 1    | 2k                | 2k                            |
| lần 2    | 4k                | 6k                            |
| lần 3    | 6k                | 12k                           |
| lần 4    | 8k                | 20k                           |
| lần 5    | 10k               | 30k                           |

```    
```   
input: 4 (lần phạt thứ 4)
ouput: 20k

input: 5 (lần phạt thứ 5)
ouput:  30k

```    


### Bài 15: Cho một mảng int[][], tính tổng các phần tử chia hết cho 5 trong mảng đó.
```
input:      {{10, 4, 8, 2}, {5, 6, 4, 9}, {20, 3, 8, 1}}
output:     35

```










