package LinkedLists;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hermes
 */

public class MergeTwoSortedLists {
      public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
     
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 =new ListNode(0);
        
        while(l1!= null || l2!= null){
            
            if(l1!=null && l2!=null){
                System.out.println("Entre en el primer if");
                System.out.println(l1.val+"/////"+l2.val);
                if(l1.val>=l2.val){
                    l3.next=l1;
                    l3.next.next=l2;
                }
                else{
                    l3.next=l2;
                    l3.next.next=l1;
                }
                
                l1=l1.next;
                l2=l2.next;
            }
            else if(l1==null && l2!=null){
                System.out.println("Entre en el segundo if");
                l3.next=l2;
                l2=l2.next;
            }
            else if(l1!=null && l2==null){
                System.out.println("Entre en el tercer if");
                l3.next=l1;
                l1=l1.next;
            }
            
            l3=l3.next;
            
            
        }
        return l3;
    }
    
     public static void main(String[] args){
     
     }
    
    
}
