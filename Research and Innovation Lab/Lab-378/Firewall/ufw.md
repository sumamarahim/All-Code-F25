# UFW
## Rules
- Allow
- Deny
- Delete
  
### Allow
`ufw allow in on eth0 from 192.168.10.10`

`in`- incoming network on `eth0` is an interface here
so this will allow all incoming network connection on `eth0` interface from the `192.168.10.10` ip address.

### Deny
`ufw deny in on eth0 from 200.20.139.0/25`

### Delete
`ufw delete rule target`
rule like `deny, allow` where `target` is the destination

`ufw delete deny in on from 200.20.139.0/25`
deletes the above deny rule

we can also delete by number of the rule
`ufw status numbered` this shows each rule with number then 

`ufw delete number(like 1, 2 etc)`


