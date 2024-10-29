# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
# Time Complexity : O(n)
# Space Complexity : O(n)
class Solution(object):
    def levelOrder(self, root):
        # Base case: If the tree is empty...
        if root is None: return []
        # Initialize a queue to store the nodes on the same level & create a list to store the output result...
        q, output = collections.deque([root]),[]
        # Traverse a loop untill the queue becomes empty...
        while q:
            # Denotes the number of elements on that level...
            size = len(q)
            # A temporary list to store all the left and right child for all the node in the level...
            temp=[]
            while size > 0:
                node = q.popleft()
                # Store the value of node to temp...
                temp.append(node.val)
                # Store all the nodes of next level...
                # Add left and right child if they are not None...
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
                size-=1
            # Add the temp to output result...
            output.append(temp)
        return output       # Return the output result...