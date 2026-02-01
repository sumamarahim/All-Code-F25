# PART A — HOME FIREWALL LAB
## LAB GOAL
### Simulate how firewalls are used in SOC environments:

- Baseline hardening
- Traffic inspection
- Attack simulation
- Log analysis
- Incident-style response

**You will not break your system if you follow the order.**

## Lab Setup
### 1. Identify your network
`ip a` `ip route`
**NOTE:** interface name: wlp3s0 (my pc's), eth0 and local IP: 172.23.186.79
### 2. Installing required tools
`apt install nmap net-tools iptables iptables-persistent ufw`

# Lab 1: Baseline hardening (SOC's Step 1)
**OBJECTIVE:** create a secure default posture like production systems.

*Baseline hardening means the proactive process to protect/secure IT Systems (servers, workstations, network devices etc.) by establishing and  setting/applying the standardized, highly secure configuration settings before going into production.*

*It involves closing unnecessary ports, disabling unused services, applying patches, and configuring security settings to reduce the attack surface and mitigate risks like data breaches or ransomware.*

# Steps
`ufw reset`

`ufw default deny incoming`

`ufw default allow outoing`

`ufw default allow ssh`

`ufw enable`

`ufw status verbose`

![alt text](image.png)

### Outcome
✔ SOC Skill: System hardening & baseline security

---
# Lab 2: Restrict access by source (Real SOC Scenario)
**Objective** Allow SSH from my machine (Simulates admin-only access)

Finding my ip
`ip addr show`