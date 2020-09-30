import {Injectable} from '@angular/core';
import {IProduct} from './iproduct';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  count = 5;
  products: Array<IProduct> = [
    {
      id: 1, name: 'iphone 1', description: 'phone 1'
    },
    {
      id: 2, name: 'iphone 2', description: 'phone 2'
    },
    {
      id: 3, name: 'iphone 3', description: 'phone 3'
    },
    {
      id: 4, name: 'iphone 4', description: 'phone 4'
    },
    {
      id: 5, name: 'iphone 5', description: 'phone 5'
    }
  ];

  constructor() {
  }

  findAll(): Array<IProduct> {
    return this.products;
  }

  findProductById(id: number): IProduct {
    return this.products.find(product => product.id === id);
  }

  update(product: IProduct) {
    this.products.forEach(i => {
      if (i.id === product.id) {
        i = product;
      }
    });
    console.log(this.products);
    console.log(this.products.length);
  }

  create(product: IProduct) {
    this.count++;
    product.id = this.count;
    this.products.push(product);
  }

  delete(product: IProduct) {
    this.products.forEach((item, index) => {
      if (item === product) {
        this.products.splice(index, 1);
      }
    });
    console.log(this.products);
  }

}
