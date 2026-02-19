# Assignment Title: Multi-Inheritance แบบ Java (Interfaces + Composition)

## Student Information
- Name: ชาคริต แสนองค์การ
- Student ID: 68122250070
- Submission Date: 19/2/69

---

## Problem Description
อธิบายโจทย์โดยย่อ:
- **ระบบนี้ทำอะไร:** จำลองการทำงานของหุ่นยนต์กู้ภัยอัจฉริยะ (Rescue Robot) 
- **เป้าหมายของโปรแกรม:** เพื่อแสดงให้เห็นถึงการใช้ Interfaces หลายตัว และการทำ Composition เพื่อแก้ปัญหาที่ Java ไม่สามารถสืบทอด (extends) หลายคลาสพร้อมกันได้ (Multi-inheritance)
- **scenario ที่ต้องรองรับ:** หุ่นยนต์ต้องสามารถบินได้ (Flyable), ขับเคลื่อนบนพื้น (Drivable), ตรวจจับความร้อนหาผู้ประสบภัย (ThermalSensor) และสื่อสารส่งพิกัดได้ (Communicable) โดยทุกๆ การกระทำจะต้องใช้พลังงานจากแบตเตอรี่

---

## Learning Objectives
- เข้าใจแนวคิด OOP เช่น Encapsulation, Inheritance, Polymorphism, Composition
- ออกแบบ class และ relationship เพื่อแก้ข้อจำกัดของภาษา
- เขียนโปรแกรมเชิงวัตถุอย่างเป็นระบบ
- รู้วิธีการแก้ปัญหาเวลาใช้ default method ใน interface แล้วชื่อชนกัน

---

## System Design

### Class Diagram (UML) แบบสรุป
- RescueRobot implements 4 interfaces: `Flyable`, `Drivable`, `ThermalSensor`, `Communicable`
- RescueRobot has-a `Battery`, `GPSTracker`, `ThermalCamera`

### Key Classes
- `RescueRobot` -> หน้าที่: เป็นคลาสหลักที่รวมความสามารถจากหลายๆ interface และประกอบชิ้นส่วนย่อยเข้าด้วยกัน ควบคุมการทำงานของหุ่นยนต์ทั้งหมด
- `Battery` -> หน้าที่: เก็บเปอร์เซ็นต์แบตเตอรี่ มีเมธอดจัดการการลดลง (drain) และชาร์จ (charge)
- `GPSTracker` -> หน้าที่: จัดเก็บและอัพเดตตำแหน่งพิกัด (latitude, longitude)
- `ThermalCamera` -> หน้าที่: สุ่มและจำลองค่าอุณหภูมิ เพื่อใช้ในการตรวจสอบว่าเจอคนหรือไม่

---

## OOP Concepts Used
- **Encapsulation:** การกำหนด private ให้กับตัวแปรต่างๆ เช่น `battery`, `gps`, `thermal` ภายในคลาส RescueRobot และดึงค่าผ่านเมธอด
- **Inheritance:** หุ่นยนต์ได้รับคุณสมบัติพฤติกรรมต่างๆ ผ่านการ implements interfaces 
- **Polymorphism:** การ Override default method ชื่อ `status()` ที่ซ้ำซ้อนกัน
- **Composition (ถ้ามี):** ใช้งานตรงที่มีการประกาศ `private Battery battery;` , `private GPSTracker gps;` และ `private ThermalCamera thermal;` ไว้ใน RescueRobot 

**ตอบคำถาม (Deliverables):**
1. **Java สืบทอดหลาย class ไม่ได้เพราะอะไร:** เพราะป้องการปัญหาความกำกวม (Diamond Problem) สมมติว่าคลาสแม่ 2 ตัวมีเมธอดชื่อเดียวกัน คลาสลูกที่ extends มาจะไม่รู้ว่าจะต้องเรียกใช้เมธอดของคลาสแม่ตัวไหน
2. **เราใช้ interface + composition แทนอย่างไร:** เราใช้ Interface เพื่อรับรองพฤติกรรม (สามารถทำอะไรได้บ้าง) ทำให้สามารถรับได้หลายบทบาท ส่วนประกอบที่เป็นสิ่งของหรือ module (เช่น แบตเตอรี่, GPS) เราใช้การสร้าง Object ไว้ในคลาสหลัก (Composition) แทนการ extends
3. **อธิบายการแก้ปัญหา default method ชื่อชนกัน:** ในโจทย์ `Flyable` และ `Drivable` มี default method ชื่อ `status()` เหมือนกัน วิธีแก้คือในคลาส RescueRobot เราต้องทำการ Override `status()` ด้วยตัวเอง แล้วใช้ keyword `InterfaceName.super.methodName()` ระบุให้ชัดเจน เช่น `Flyable.super.status()` เพื่อเรียกใช้งานให้ถูกตัว

---

## How to Compile and Run

### Java Example
```bash
javac *.java
java Main
