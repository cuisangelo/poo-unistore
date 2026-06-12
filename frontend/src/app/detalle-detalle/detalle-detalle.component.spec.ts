import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetalleDetalleComponent } from './detalle-detalle.component';

describe('DetalleDetalleComponent', () => {
  let component: DetalleDetalleComponent;
  let fixture: ComponentFixture<DetalleDetalleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetalleDetalleComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetalleDetalleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
