# Python Assigments for CMS-A DSE-B 2024 (Python 3 Programming lab) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

# 11. Create a ‘Graph’ class to store and manipulate graphs. It should have the 
# following funcƟons: 
# i. Read an edge list file, where each edge (u, v) appears exactly once in 
# the file as space separated values. 
# ii. Add and remove nodes and edges 
# iii. Print nodes, and edges in a user readable format 
# Iv. Finding all the neighbors of a node 
# v. Finding all the connected components and storing them as individual 
# Graph objects inside the class 
# vi. Finding single source shortest paths using Breadth First Search     . [20.12.23]

from collections import defaultdict, deque

class Graph:
    def __init__(self):
        self.graph = defaultdict(list)

    def read_edge_list(self, file_path):
        with open(file_path, 'r') as file:
            for line in file:
                u, v = map(int,line.split())
                self.add_edge(u, v)

    def add_edge(self, u, v):
        self.graph[u].append(v)
        self.graph[v].append(u)

    def remove_edge(self, u, v):
        self.graph[u].remove(v)
        self.graph[v].remove(u)

    def add_node(self, node):
        if node not in self.graph:
            self.graph[node] = []

    def remove_node(self, node):
        del self.graph[node]
        for key, value in self.graph.items():
            if node in value:
                value.remove(node)

    def print_nodes(self):
        print("Nodes:", list(self.graph.keys()))

    def print_edges(self):
        print("Edges:")
        for node, neighbors in self.graph.items():
            for neighbor in neighbors:
                print(f"({node}, {neighbor})",end=" ")

    def find_neighbors(self, node):
        return self.graph[node]

    def find_connected_components(self):
        visited = set()
        components = []

        for node in self.graph:
            if node not in visited:
                component = self.bfs(node, visited)
                components.append(component)

        return components

    def bfs(self, start, visited):
        component = []
        queue = deque([start])
        visited.add(start)

        while queue:
            current_node = queue.popleft()
            component.append(current_node)

            for neighbor in self.graph[current_node]:
                if neighbor not in visited:
                    queue.append(neighbor)
                    visited.add(neighbor)

        return component

    def bfs_shortest_paths(self, start):
        visited = set()
        distance = {node: float('inf') for node in self.graph}
        distance[start] = 0
        queue = deque([start])

        while queue:
            current_node = queue.popleft()

            for neighbor in self.graph[current_node]:
                if neighbor not in visited:
                    queue.append(neighbor)
                    visited.add(neighbor)
                    distance[neighbor] = distance[current_node] + 1

        return distance

def main():
    # Create a Graph object
    graph = Graph()
    

    # Read edge list from a file
    graph.read_edge_list("ass11_edge_list.txt")

    # Print initial nodes and edges
    print("Initial Graph:")
    graph.print_nodes()
    graph.print_edges()

    # Add a new node and edge
    graph.add_node(6)
    graph.add_edge(6, 5)
    graph.add_edge(6, 2)

    # Print nodes and edges after modification
    print("\nGraph after Modification:")
    graph.print_nodes()
    graph.print_edges()
    # Find neighbors of a node
    print("\nNeighbors of Node 6:", graph.find_neighbors(6))
    print("Neighbors of Node 3:", graph.find_neighbors(3))

    # Find connected components
    components = graph.find_connected_components()
    print("\nConnected Components:", components)

    # Find shortest paths from a source node
    shortest_paths = graph.bfs_shortest_paths(1)
    print("\nShortest Paths from Node 1:", shortest_paths)

if __name__ == "__main__":
    main()


# Output:
# Initial Graph:
# Nodes: [1, 2, 4, 3, 5]
# Edges:
# (1, 2) (1, 3) (2, 1) (2, 4) (4, 2) (4, 3) (4, 5) (3, 4) (3, 1) (5, 4)
# Graph after Modification:
# Nodes: [1, 2, 4, 3, 5, 6]
# Edges:
# (1, 2) (1, 3) (2, 1) (2, 4) (2, 6) (4, 2) (4, 3) (4, 5) (3, 4) (3, 1) (5, 4) (5, 6) (6, 5) (6, 2)
# Neighbors of Node 6: [5, 2]
# Neighbors of Node 3: [4, 1]

# Connected Components: [[1, 2, 3, 4, 6, 5]]

# Shortest Paths from Node 1: {1: 2, 2: 1, 4: 2, 3: 1, 5: 3, 6: 2}



# import networkx as nx
# import matplotlib.pyplot as plt

# graph visuallization
# def visualize_graph(graph):
#     G = nx.Graph(graph.graph)
#     pos = nx.spring_layout(G)
#     nx.draw(G, pos, with_labels=True, font_weight='bold', node_size=700, node_color='skyblue', font_size=8, width=1.5, edge_color='gray')
#     plt.show()