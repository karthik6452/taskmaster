output "vpc_id" {
  value = aws_vpc.main.id
}

output "subnet_ids" {
  value = aws_subnet.public[*].id
}

output "load_balancer_dns_name" {
  value = aws_lb.ecs_lb.dns_name
}
