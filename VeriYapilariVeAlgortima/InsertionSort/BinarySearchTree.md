# Binary Search Tree Projesi

## [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.

 **Root = 7**   



 ## root 7 olduğu için  5<7 bu yüzden 7'nin soluna 5'i yazıyoruz                                                                                    

                                                7
                                              / 
                                            5  

## 1<7 bu yüzden sola yazıyoruz 1<5 de olduğu için 5'inde soluna yazıyoruz

                                               7
                                              / 
                                            5 
                                           /  
                                          1 
## 8>7'den bu yüzden 7'nin sağına 8'i yazıyoruz

                                                7
                                              /   \  
                                            5       8
                                           /  
                                          1  

## 3<7 7'nin soluna yazıyoruz 3<5 5'in soluna yazıyor 3>1 1'in sağına yazıyoruz
                                                7
                                              /   \  
                                            5       8
                                           /  
                                          1  
                                            \
                                             3
## 6<7 7'nin soluna yazıyor 6>5 5'in sağına yazıyoruz
                                                7
                                              /   \  
                                            5       8
                                           / \ 
                                          1   6
                                            \
                                             3
## 0<7, 0<5, 0<1 1'den küçük olduğu için soluna yazıyoruz
                                                7
                                              /   \  
                                            5       8
                                           / \ 
                                          1   6
                                         / \
                                        0   3
## 9>7, 9>8 8'in sağına yazıyoruz
                                                7
                                              /   \  
                                            5       8
                                           / \       \
                                          1   6       9  
                                         / \
                                        0   3

## 4<7, 4<5, 4>1, 4>3 3'ten büyük oluduğu için sağına yazıyoruz
                                                7
                                              /   \  
                                            5       8
                                           / \       \
                                          1   6       9  
                                         / \
                                        0   3
                                             \
                                              4
## 2<7, 2<5, 2>1, 2<3 3'ten küçük oluduğu için soluna yazıyoruz
                                                7
                                              /   \  
                                            5       8
                                           / \       \
                                          1   6       9  
                                         / \
                                        0   3
                                           / \
                                          2   4                                              