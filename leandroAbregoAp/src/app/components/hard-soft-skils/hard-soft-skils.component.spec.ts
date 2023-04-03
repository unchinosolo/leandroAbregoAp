import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HardSoftSkilsComponent } from './hard-soft-skils.component';

describe('HardSoftSkilsComponent', () => {
  let component: HardSoftSkilsComponent;
  let fixture: ComponentFixture<HardSoftSkilsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HardSoftSkilsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HardSoftSkilsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
