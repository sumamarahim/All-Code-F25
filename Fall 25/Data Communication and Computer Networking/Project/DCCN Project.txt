I cannot directly create or export a downloadable PDF or DOC file for you. However, I have formatted the entire case study below so you can easily copy and paste it into Microsoft Word or Google Docs.
Once pasted, you can save it as a .docx or .pdf to share with your group.
DCCN Semester Project
(Smart Hotel Network Design & Implementation)
As a part of your 3rd-semester networking project, you are required to design and implement the “Smart Hotel Network System”.
Blue Horizon Resorts is a rapidly growing hospitality company. The company is intending to open a new high-tech luxury resort. The resort features a Main Headquarters building and two separate Guest Villas.
Therefore, the company would like to source knowledge from a group of second-year students to design and implement their network. Carefully read the requirements, then model the design and implement the network based on the company’s needs.
The resort is divided into three main buildings/zones as provided in the tables below.
The following table: Main Building (HQ)
| No. | Departments | No. of PC/Dev | No. of Printers |
|---|---|---|---|
| 1 | Management (Admin) | 15 | 2 |
| 2 | Front Desk / Lobby | 10 | 2 |
| 3 | Conference Rooms | 40 (Wired/Wireless) | 1 |
The following table: Guest Villa A
| No. | Departments | No. of PC/Dev | No. of Printers |
|---|---|---|---|
| 1 | Guest Rooms (WiFi) | 50 (Guests) | 0 |
| 2 | Room Controls (IoT) | 50 (Smart Devices) | 0 |
The following table: Guest Villa B
| No. | Departments | No. of PC/Dev | No. of Printers |
|---|---|---|---|
| 1 | Guest Rooms (WiFi) | 50 (Guests) | 0 |
| 2 | Room Controls (IoT) | 50 (Smart Devices) | 0 |
The following table: Server Room (Main Building - Floor 3)
| No. | Departments | No. of PC | No. of Printers | No. of Servers |
|---|---|---|---|---|
| 1 | IT Support | 5 | 1 | N/A |
| 2 | Server Farm | 2 | 1 | 3 (DHCP, HTTP & Email) |
Requirements:
1. Visualize the Network Topology:
 * Use a software modeling tool to visualize the network topology.
 * Software Modelling Tools: MS Visio, Visual Paradigm, or Draw.io for modeling network design.
2. Network Implementation & Simulation:
 * Use network simulation software to implement the above topology.
 * Simulation software: Cisco Packet Tracer or GNS3 for design & implementation.
 * There should be one router for each building (Main Building, Villa A, Villa B). The routers should be connecting switches in that building.
 * Use OSPF as the routing protocol to advertise routes between the buildings.
 * Each department/zone is required to have a wireless network for the users.
 * Host devices in the network are required to obtain IPV4 addresses automatically.
 * All devices in the network are expected to obtain an IP address dynamically from the dedicated DHCP server located in the Server Room.
 * Create HTTP (Hotel Website) and E-mail servers.
 * Configure SSH in all the routers for remote login.
3. Basic Device Configuration:
 * Configure the basic configuration of the devices:
   * Hostnames
   * Line Console & VTY passwords
   * Disable domain IP lookup
4. VLAN Configuration:
 * Each department should be in a different VLAN.
 * Create VLANs for every department (e.g., Management, Guest WiFi, IoT, Staff).
 * VLAN 10, 20, 30... etc.
 * Each VLAN should be a different subnetwork.
5. Planning of IP addresses:
 * You have been given 192.168.10.0 as the base address for this network.
 * Do subnetting based on the number of hosts in every department.
 * Identify the subnet mask, useable IP address range, and broadcast address for each subnet.
6. End Devices Configurations:
 * Configure all the end devices in the network with the appropriate IP address based on the calculations above (via DHCP).
7. Configure Port Security:
 * Use the sticky command to obtain the MAC address.
 * Violation mode of shutdown.
8. Test Communication:
 * Do devices in the same VLAN communicate?
 * Do the devices in different VLANs communicate?
 * Security Check: Ensure guests cannot access the Admin/Management VLANs.
Next Steps for You
 * Copy the text above.
 * Open Microsoft Word.
 * Paste the text.
 * Save the file as Case_Study_Smart_Hotel_Network.docx or PDF.
Would you like me to help you solve Requirement 5 (IP Address Planning) now? We need to calculate the subnets for the 50 guests and 50 IoT devices.
