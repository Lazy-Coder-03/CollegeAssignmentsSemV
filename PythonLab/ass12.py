# Python Assigments for CMS-A DSE-B 2024 (Python 3 Programming lab) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

# 12. Make a ‘DiGraph’ class to handle directed graphs which inherits from the 
# ‘Graph’ class. In addiƟon to all of the funcƟonaliƟes of (a), it should support 
# the following operaƟons 
# i. Finding the predecessors and successors of a node 
# ii. CreaƟng a new ‘DiGraph’ object where all the edges are reversed 
# .iii. Finding the strongly connected components

from ass11 import *;

class DiGraph(Graph):
    def __init__(self):
        super().__init__()

    def predecessors(self, node):
        return [key for key, value in self.graph.items() if node in value]

    def successors(self, node):
        return self.graph[node]

    def reverse_edges(self):
        reversed_graph = DiGraph()
        for node, neighbors in self.graph.items():
            for neighbor in neighbors:
                reversed_graph.add_edge(neighbor, node)
        return reversed_graph

    def strongly_connected_components(self):
        components = []
        visited = set()

        for node in self.graph:
            if node not in visited:
                component = self.dfs(node, visited)
                components.append(component)

        return components

    def dfs(self, node, visited):
        component = []
        stack = [node]

        while stack:
            current_node = stack.pop()

            if current_node not in visited:
                component.append(current_node)
                visited.add(current_node)

                for neighbor in self.graph[current_node]:
                    stack.append(neighbor)

        return component
    
    

def main():

# Create a DiGraph object
    digraph = DiGraph()

    # Read edge list from a file
    digraph.read_edge_list("ass11_edge_list.txt")

    # Print initial nodes and edges
    print("Initial DiGraph:")
    digraph.print_nodes()
    digraph.print_edges()

    # Add a new node and edge
    digraph.add_node(7)
    digraph.add_edge(6, 7)

    # Print nodes and edges after modification
    print("\nDiGraph after Modification (adding node 7 and connecting it to 6):")
    digraph.print_nodes()
    digraph.print_edges()


    # Find predecessors and successors of a node
    node_to_check = 6
    print(f"\nPredecessors of Node {node_to_check}: {digraph.predecessors(node_to_check)}")
    print(f"Successors of Node {node_to_check}: {digraph.successors(node_to_check)}")

    # Reverse the edges and visualize the reversed graph
    reversed_digraph = digraph.reverse_edges()
    print("\nReversed DiGraph:")
    reversed_digraph.print_edges()

    # Find strongly connected components
    components = digraph.strongly_connected_components()
    print("\nStrongly Connected Components:", components)


if __name__ == "__main__":
    main()    
    
    
# Output:
# Initial DiGraph:
# Nodes: [1, 2, 4, 3, 5]
# Edges:
# (1, 2) (1, 3) (2, 1) (2, 4) (4, 2) (4, 3) (4, 5) (3, 4) (3, 1) (5, 4)
# DiGraph after Modification (adding node 7 and connecting it to 6):
# Nodes: [1, 2, 4, 3, 5, 7, 6]
# Edges:
# (1, 2) (1, 3) (2, 1) (2, 4) (4, 2) (4, 3) (4, 5) (3, 4) (3, 1) (5, 4) (7, 6) (6, 7)
# Predecessors of Node 6: [7]
# Successors of Node 6: [7]

# Reversed DiGraph:
# Edges:
# (2, 1) (2, 1) (2, 4) (2, 4) (1, 2) (1, 3) (1, 2) (1, 3) (3, 1) (3, 4) (3, 4) (3, 1) (4, 2) (4, 2) (4, 3) (4, 5) (4, 3) (4, 5) (5, 4) (5, 4) (6, 7) (6, 7) (7, 6) (7, 6)
# Strongly Connected Components: [[1, 3, 4, 5, 2], [7, 6]]